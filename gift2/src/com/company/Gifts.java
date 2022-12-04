package com.company;

public class Gifts {
    String tourName;
    double period;
    double price;

    public Gifts(String tourName, double period, double price) {
        this.tourName = tourName;
        this.period = period;
        this.price = price;
    }

    public Gifts(String tourName) {
           }

    public Gifts(Gifts gifts) {
       price = gifts.price;
    }

    public Gifts(double i) {
        period = i;
    }

    void howLong(){
        if (period == 1){
            price=price;
            System.out.println("a trip lasting less than one week: " + price + "  UAH");}
        else if (period > 1 || period <= 3){
            price-=500;
            System.out.println("a trip lasting less than three week: " + price + "  UAH");}
        else{
            price-=1000;
            System.out.println("a trip that lasts more than three weeks: " + price + "  UAH");}
    }
    double lucky(){
        double r = price-period;
        return r;
    }

    double goodTrip(){
        double r = price/2;
        return r;}

    int goodTrip(int price){
        int r = (int) (price / 2);
        return r;}
    }


