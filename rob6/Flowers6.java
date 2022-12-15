package lab.rob6;

import lab.rob5.Flowers5;

public class Flowers6 implements Birthday{

    public Flowers5 flowers5;

    public Flowers6(Flowers5 flowers5) {
        this.flowers5 = flowers5;
    }


    @Override
    public void birthday(int date) {
        System.out.println("Можете вибрати " + date + " безкоштовних квіток !");
    }
}
