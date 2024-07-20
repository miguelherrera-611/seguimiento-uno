package programa2;

import java.util.Scanner;

public class MainProg2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos es 3651 + 9582?");

        int t = sc.nextInt();

        Prog2 prog = new Prog2();

        prog.progmm2(t);

        System.out.println("gracias por responder");

    }
}