package lab;

import lab.rob1.*;
import lab.rob2.*;
import lab.rob3.*;
import lab.rob4.*;
import lab.rob5.*;
import lab.rob6.*;

public class Dispatching {

    public void dispatching() {
        Accessories5 accessories = new Accessories5(new Accessories4(new Accessories3(new Accessories2(new Accessories(12000, 123, 123123, "Odlg", "red", "leather", 3)))));
        Flowers6 flowers = new Flowers6(new Flowers5(new Flowers4(new Flowers3(new Flowers2(new Flowers("fol", "black", 160, 3, 2345, 12))))));
        Toys6 toys = new Toys6(new Toys4(new Toys3(new Toys2(new Toys("soda", "red", 160, 12, 1200)))));

        accessories.accessories4.accessories3.getPriceAccessories();
        accessories.accessories4.accessories3.getPriceAccessories(5);
        accessories.accessories4.accessories3.getPriceAccessories();
        accessories.accessories4.accessories3.getSuccess();
        accessories.accessories4.accessories3.getAdvertisement();

        flowers.flowers5.flowers4.flowers3.getBouquets("fog", 1,3,4,5,6);
        flowers.flowers5.flowers4.flowers3.getCostAll();
        flowers.flowers5.flowers4.flowers3.getCostDied();
        flowers.flowers5.flowers4.flowers3.getAdvertisement();

        toys.toys4.toys3.getAdvertisement();
        toys.toys4.toys3.getDiscaunted();
        toys.toys4.toys3.getLottery(19);

        NewAccessories.success(accessories.accessories4.accessories3.accessories2.accessories);
    }

}
