package lab.rob3;

import lab.rob2.Toys2;

public class Toys3 {

    public Toys2 toys2;

    public Toys3(Toys2 toys2) {
        this.toys2 = toys2;
    }

    private void discaunted() {
        toys2.toys.discaunted();
    }

    public void getDiscaunted() {
        discaunted();
    }

    private void advertisement() {
        toys2.advertisement();
    }

    public void getAdvertisement() {
        advertisement();
    }

    private int lottery(int age) {
        return toys2.lottery(age);
    }

    public int getLottery(int age) {
        return lottery(age);
    }

}
