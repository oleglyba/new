package lab.rob6;

import lab.rob4.Toys4;

public class Toys6 implements Birthday{

    public Toys4 toys4;

    public Toys6(Toys4 toys4) {
        this.toys4 = toys4;
    }


    @Override
    public void birthday(int date) {
        if (date < 6 && date > 1) {
            System.out.println("Вам знижка на іграшки 5%");
        }
    }
}
