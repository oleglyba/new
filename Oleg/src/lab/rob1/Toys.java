package lab.rob1;

public class Toys {

    private String name;
    private String color;
    private double length;
    private double width;
    private double price;

    public Toys(String name, String color, double length, double width, double price) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.width = width;
        this.price = price;
    }


    public void discaunted() {
        if (color.equals("black")) {
            price -= 20;
            System.out.println("Ціна зі знижкою: " + price + " грн");
        } else if (color.equals("white")) {
            price -= 15;
            System.out.println("Ціна зі знижкою: " + price + " грн");
        } else if (color.equals("purple")) {
            price -= 5;
            System.out.println("Ціна зі знижкою: " + price + " грн");
        } else {
            System.out.println("Знижки на даний товар немає");
        }
    }


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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
