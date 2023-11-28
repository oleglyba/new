package com.example.demo1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {

    @FXML
    private TextField foodField;

    @FXML
    private Label restoLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private Label timeLabel;

    @FXML
    private Label menuLabel;

    @FXML
    private ListView<String> orderListView;


    private List<String[]> orderedItems;


    private static final String[][] restaurantData = {
            {"Celentano", "Italian", "20 minutes", "Pizza, Pasta"},
            {"Pasta Palace", "Italian", "25 minutes", "Pasta, Lasagna"},
            {"Львівські Круасани", "Mexican", "15 minutes", "Tacos, Burritos"},
            {"Sushi Bar", "Japanese", "25 minutes", "Sushi, Sashimi"},
            {"Celentano", "Ukrainian", "20 minutes", "Meat"}


    };

    public Order() {
        this.orderedItems = new ArrayList<>();
    }

    @FXML
    private void handleSearch() {
        String searchQuery = foodField.getText();

        for (String[] restaurant : restaurantData) {
            if (restaurant[3].toLowerCase().contains(searchQuery.toLowerCase())) {
                updateLabels(restaurant);
                return;
            }
        }

        updateLabels(new String[]{"No Match", "", "", ""});
    }

    @FXML
    private void handleAdd() {
        if (!"No Match".equals(restoLabel.getText())) {
            String foodItem = foodField.getText();
            String restaurant = restoLabel.getText();
            orderedItems.add(new String[]{foodItem, restaurant});

            // Update the ListView
            updateOrderListView();
        }
    }

    @FXML
    private void handleRemove() {
        String selectedItem = orderListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            String[] parts = selectedItem.split(" from ");
            String foodItem = parts[0];
            String restaurant = parts[1];

            orderedItems.removeIf(item -> item[0].equals(foodItem) && item[1].equals(restaurant));


            updateOrderListView();
        }
    }

    private void updateLabels(String[] restaurant) {
        restoLabel.setText(restaurant[0]);
        typeLabel.setText(restaurant[1]);
        timeLabel.setText(restaurant[2]);
        menuLabel.setText(restaurant[3]);
    }

    // Helper method to update the ListView
    private void updateOrderListView() {
        orderListView.getItems().clear();
        for (String[] item : orderedItems) {
            orderListView.getItems().add(item[0] + " from " + item[1]);
        }
    }

    @FXML
    private void handleOrder(ActionEvent event) {
        if (orderedItems.isEmpty()) {
            System.out.println("No items in the order list.");
            return;
        }

        System.out.println("Ordered items:");

        for (String[] item : orderedItems) {
            System.out.println(item[0] + " from " + item[1]);
        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Confirm Order");

        // Create a TextArea to display the order details
        TextArea orderDetails = new TextArea();
        orderDetails.setEditable(false);
        orderDetails.setWrapText(true);

        for (String[] item : orderedItems) {
            orderDetails.appendText(item[0] + " from " + item[1] + "\n");
        }

        alert.getDialogPane().setContent(orderDetails);

        alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.CANCEL);

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                showGreetingAlert();

               changeOne(event);
            } else {
                System.out.println("Order canceled.");
            }
        });
    }
        @FXML
    private void showGreetingAlert() {
        Alert greetingAlert = new Alert(Alert.AlertType.INFORMATION);
        greetingAlert.setTitle("Greetings");
        greetingAlert.setHeaderText("Welcome to Our Restaurant!");

        TextInputDialog locationDialog = new TextInputDialog();
        locationDialog.setTitle("Location Input");
        locationDialog.setHeaderText("Please enter your location:");
        locationDialog.setContentText("Location:");

        locationDialog.showAndWait().ifPresent(location -> {
            TextArea orderDetails = new TextArea();
            orderDetails.setEditable(false);
            orderDetails.setWrapText(true);

            orderDetails.appendText("Ordered items:\n");

            for (String[] item : orderedItems) {
                orderDetails.appendText(item[0] + " from " + item[1] + "\n");
            }

            orderDetails.appendText("\nDelivery to: " + location);

            // Add the order details to the content of the dialog
            greetingAlert.getDialogPane().setContent(orderDetails);

            greetingAlert.showAndWait();
        });
    }



    private void changeOne(ActionEvent ev) {
        Stage currentStage = (Stage) ((Node) ev.getSource()).getScene().getWindow();
        currentStage.close();

        try {
            Parent root = FXMLLoader.load(getClass().getResource("congratulation.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}