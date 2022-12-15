package lab.rob3;

import lab.rob2.Accessories2;

public class Accessories3 {



    public Accessories2 accessories2;

    public Accessories3(Accessories2 accessories2) {
        this.accessories2 = accessories2;
    }

    private int priceAccessories() {
        return accessories2.accessories.priceAccessories();
    }

    public int getPriceAccessories() {
        return priceAccessories();
    }

    private void success() {
        accessories2.accessories.success();
    }

    public void getSuccess() {
        success();
    }

    private int priceAccessories(int coupon) {
        return accessories2.priceAccessories(coupon);
    }

    public int getPriceAccessories(int coupon) {
        return priceAccessories(coupon);
    }

    private void advertisement() {
        accessories2.advertisement();
    }

    public void getAdvertisement() {
        advertisement();
    }

}
