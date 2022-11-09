package com.company;

    public class Main {

        public static void main(String[] args) {
            Flowers flowers = new Flowers("rose", 7, 38, 5);
            Flowers flowers1 = new Flowers("tulip", 12, 60, 5);
            Toys toys = new Toys("Bear", "white", 3, 330);
            Gifts gifts =new Gifts("Cyprus",2,10000);

            System.out.println("name: " + flowers.name + "\nIt will wither through: " + flowers.diedAfter + " days" + "\nQuantity: " + flowers.number);
            flowers.costDied();
            System.out.println("Bouquet price: " + flowers.costAll() + " UAH");
            flowers.bouquets("Adult ", 23);

            System.out.println();
            System.out.println("\nname of toys: " + toys.name + "\ncolor of toys: " + toys.color + "\nAge from which you can use it: " + toys.ageFrom + " years"+"\nPrise of toys: " + toys.price+ " UAH");

            System.out.println("\nTour: " + gifts.tourName + "\nperiod: " + gifts.period+" weeks ");
           gifts.howLong();
     }
   }