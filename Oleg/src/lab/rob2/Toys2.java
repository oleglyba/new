package lab.rob2;

import lab.rob1.Toys;

public class Toys2 {

    public Toys toys;

    public Toys2(Toys toys) {
        this.toys = toys;
    }

    public void advertisement() {
        System.out.println("Оголошення персоналу\n У відділі з м'якими ведмедиками розкинуті іграшки !");
    }



    public int lottery(int number) {
        System.out.println("Відгадай число і виграй медведика !");

        if (number == 1){
            return number;
        }
        if (number == 5) {
            System.out.println("Ви виграли медведика !");
            return 0;

        }
        System.out.println(number);
        return number * lottery(number - 1);
    }
}
