package lab.rob1;

public class Accessories {

    private double salary;
    private int numberEmployees; // кількість працівників
    private int numberSales; // кількість проданих товарів
    private String name;
    private String color;
    private String material;
    private int countAccessories;

    public Accessories(double salary, int numberEmployees, int numberSales, String name, String color, String material, int countAccessories) {
        this.salary = salary;
        this.numberEmployees = numberEmployees;
        this.numberSales = numberSales;
        this.name = name;
        this.color = color;
        this.material = material;
        this.countAccessories = countAccessories;
    }

    public int priceAccessories() {
        if (material.equals("leather")) {
            return 300;
        } else if(material.equals("leather substitute")){
            return 250;
        } else if(material.equals("fabric")){
            return 200;
        } else{
            return 150;
        }
    }

    public void success() {
        int temp = priceAccessories();
        if (material.equals("leather")) {
            System.out.println("Знижок не буде");
        } else if(material.equals("leather substitute")){
            temp =- 20;
            System.out.println("Ціна зі знижкою: "+ temp+ " грн");
        } else if(material.equals("fabric")){
            temp -= 10;
            System.out.println("Ціна зі знижкою: "+ temp + " грн");
        } else{
            temp -= 5;
            System.out.println("Ціна зі знижкою: "+ temp + " грн");
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public int getCountAccessories() {
        return countAccessories;
    }

    public void setCountAccessories(int countAccessories) {
        this.countAccessories = countAccessories;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public int getNumberSales() {
        return numberSales;
    }

    public void setNumberSales(int numberSales) {
        this.numberSales = numberSales;
    }
}
