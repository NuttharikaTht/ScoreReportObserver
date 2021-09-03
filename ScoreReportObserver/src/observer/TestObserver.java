package observer;

import java.util.Scanner;

public class TestObserver {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String score;

        Registrar1 reg1 = new Registrar1();
        Registrar2 reg2 = new Registrar2();

        HeadQuater obj = new HeadQuater();

        obj.register(reg1);
        obj.register(reg2);

        do {
            System.out.print("Enter Score ");
            score = inp.nextLine();
            if (!score.isEmpty()) {
                obj.setScore(score);
            }
        } while (!score.isEmpty());
    }
}
