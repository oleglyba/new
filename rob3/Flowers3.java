package lab.rob3;

import lab.rob2.Flowers2;

public class Flowers3 {

    public Flowers2 flowers2;

    public Flowers3(Flowers2 flowers2) {
        this.flowers2 = flowers2;
    }

    private void costDied() {
        flowers2.flowers.costDied();
    }

    public void getCostDied() {
        costDied();
    }

    private double costAll() {
        return flowers2.flowers.costAll();
    }

    public double getCostAll() {
        return costAll();
    }

    private void bouquets(String ms, int... v) {
        flowers2.flowers.bouquets(ms, v);
    }

    public void getBouquets(String ms, int... v) {
        bouquets(ms, v);
    }

    private void advertisement() {
        flowers2.advertisement();
    }

    public void getAdvertisement() {
        advertisement();
    }

}
