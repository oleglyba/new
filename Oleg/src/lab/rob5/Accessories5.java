package lab.rob5;

import lab.rob4.Accessories4;

public class Accessories5 extends Warning{

    public Accessories4 accessories4;

    public Accessories5(Accessories4 accessories4) {
        this.accessories4 = accessories4;
    }


    @Override
    public void warning() {
        System.out.println("Виявлена недостача товару\n    !!!! Хтось вкрав товар !!!!");
    }
}
