package com.company;

public class Flowers {
        String name;
        double diedAfter; // кількість днів перед тим, як зав'яне
        double price;
        double number;


    public Flowers(String name, double diedAfter, double price, double number) {
        this.name = name;
        this.diedAfter = diedAfter;
        this.price = price;
        this.number = number;
    }

    void costDied(){
            if (diedAfter == 7){
                price -= 10;
                System.out.println("Price of one flower: " + price + "  UAH");}
            else if(diedAfter >=5 && diedAfter<7){
                price -= 15;
                System.out.println("Price of one flower: " + price + "  UAH");}
            else if(diedAfter >= 3 && diedAfter<5){
                price -= 20;
                System.out.println("Price of one flower: " + price + "  UAH");}
            else {
                System.out.println("Price of one flower: " + price + "  UAH");
            }
        }
    double lucky(){
        double s = price-diedAfter;
        return s;
    }
        double costAll(){
            double s = price * number;
            return s;
        }
        int costAll(int price, int number) {
        int a = price * number;
        return a;}

        void bouquets(String ms, int... v){
            System.out.print("Offer of the day: \n"+ms + "bouquet: ");
            for(int x: v)
                System.out.print(x + " "  + name);}

    }
