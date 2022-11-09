package com.company;

public class Toys {
    String name;
    String color;
    double ageFrom; //вік з якого можна використовувати
    double price;

    public Toys(String name, String color, double ageFrom, double price) {
        this.name = name;
        this.color = color;
        this.ageFrom = ageFrom;
        this.price = price;
    }

    double lycky() {
        double s = price * 0.1;
        return s;
    }

    void discaunted() {
        switch (color) {
            case "black": {
                price -= 20;
                System.out.println("Ціна зі знижкою: " + price + " грн");
            }
            case "white": {
                price -= 15;
                System.out.println("Ціна зі знижкою: " + price + " грн");
            }
            case "purple":{
                price -= 5;
                System.out.println("Ціна зі знижкою: " + price + " грн");
            }
            default:
                System.out.println("Знижки на даний товар немає");
        }
    }
}
