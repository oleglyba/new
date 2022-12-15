package lab.rob2;

import lab.rob1.Accessories;

public class Accessories2 {

    public Accessories accessories;

    public Accessories2(Accessories accessories) {
        this.accessories = accessories;
    }

    public int priceAccessories(int coupon) {
        if (coupon == 5) {
            System.out.println("У вас є купон на 5%\nВи получаєте знижку 5%");
            return 5;
        } else if (coupon == 10) {
            System.out.println("У вас є купон на 10%\nВи получаєте знижку 10%");
            return 10;
        } else {
            System.out.println("У нас нема таких купонів !");
            return 0;
        }
    }

    public void advertisement() {
        System.out.println("Оголошення персоналу\nПотрібно поскладати новий товар !");
    }

}
