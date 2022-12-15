package lab.rob3;

import lab.rob1.Accessories;

public class NewAccessories {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void success(Accessories a) {
        if(a.getNumberEmployees()<=4 && a.getNumberSales() >=3 && a.getNumberSales()<7){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary()  + " + 100 грн" + " грн" + ANSI_GREEN);}

        else if(a.getNumberEmployees()<= 4 && a.getNumberSales() >=7 && a.getNumberSales() <10){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary()  + " + 200 грн" + " грн" + ANSI_GREEN);}

        else if(a.getNumberEmployees()<= 4 && a.getNumberSales() ==10){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary() + " + 300 грн" + " грн" + ANSI_GREEN);}

        else if(a.getNumberEmployees()<= 4 && a.getNumberSales() > 10){
            System.out.println(ANSI_RESET + "Зарплата з премією : "+ a.getSalary()  + " * 1.2 грн" + " грн" + ANSI_GREEN);}

        else{
            System.out.println(ANSI_RESET + "Зарплата без премій: "+ a.getSalary() + " грн" + ANSI_RED);}
    }

}
