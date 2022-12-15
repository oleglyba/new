package lab.rob1;

public class Flowers {

    private String name;
    private String color;
    private double height;
    private double diedAfter;
    private double price;
    private double number;

    public Flowers(String name, String color, double height, double diedAfter, double price, double number) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.diedAfter = diedAfter;
        this.price = price;
        this.number = number;
    }

    public void costDied(){
        if (diedAfter == 7){
            price -= 10;
            System.out.println("Ціна однієї квітки: " + price + " грн");}
        else if(diedAfter >=5 && diedAfter<7){
            price -= 15;
            System.out.println("Ціна однієї квітки: " + price + " грн");}
        else if(diedAfter >= 3 && diedAfter<5){
            price -= 20;
            System.out.println("Ціна однієї квітки: " + price + " грн");}
        else {
            System.out.println("Ціна однієї квітки: " + price + " грн");
        }
    }

    public double costAll(){
        double s;
        s = price * number;
        return s;
    }


    public void bouquets(String ms, int... v){
        System.out.print(ms + "букет починається з: ");
        for(int x: v)
            System.out.print(x + " "  + "квітів");}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiedAfter() {
        return diedAfter;
    }

    public void setDiedAfter(double diedAfter) {
        this.diedAfter = diedAfter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
