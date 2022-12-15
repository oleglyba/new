package lab.rob5;

import lab.rob4.Flowers4;

public class Flowers5 extends Warning{

    public Flowers4 flowers4;

    public Flowers5(Flowers4 flowers4) {
        this.flowers4 = flowers4;
    }

    @Override
    public void warning() {
        System.out.println("Потрібно перенести квіти в теплицю !");
    }
}
