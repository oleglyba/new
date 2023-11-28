package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private CheckBox rememberMeCheck;

    private static final int MIN_PASSWORD_LENGTH = 6;
    private static final String GMAIL_SUFFIX = "@gmail.com";

    @FXML
    private void handleCreateAccount(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();

        if (isValidInput(email, password, confirmPassword, firstName, lastName)) {
            UserCredentials.setUsername(email);
            UserCredentials.setPassword(password);
            UserCredentials.setFirstName(firstName);
            UserCredentials.setLastName(lastName);

            showAlert("Registration Successful", "Акаунт створено успішно!");

            redirectToEditPage(event);
        } else {
            System.out.println("Invalid Input");
        }
    }

    private boolean isValidInput(String email, String password, String confirmPassword, String firstName, String lastName) {
        if (email.isEmpty() || !email.endsWith(GMAIL_SUFFIX)) {

            showAlert("Невірний Email", "Будь ласка, введіть дійсну адресу Gmail.");
            return false;
        }

        if (password.length() < MIN_PASSWORD_LENGTH) {
            showAlert("Невірний пароль", "Пароль повинен містити принаймні " + MIN_PASSWORD_LENGTH + " символів.");
            return false;
        }

        if (!password.equals(confirmPassword)) {
            showAlert("Невідповідність паролів", "Паролі не збігаються.");
            return false;
        }

        if (!isAlpha(firstName) || !isAlpha(lastName)) {
            showAlert("Невірне ім'я", "Ім'я та прізвище повинні містити тільки букви.");
            return false;
        }

        return true;
    }

    private boolean isAlpha(String str) {
        return str.chars().allMatch(Character::isLetter);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void redirectToEditPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("edit.fxml"));
            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
