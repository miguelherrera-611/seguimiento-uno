package programa3;

import java.util.Scanner;

public class MainProg3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos es 7583 - 2364?");

        int t = sc.nextInt();

        Prog3 prog = new Prog3();

        prog.progmm3(t);

        System.out.println("gracias por responder");

    }
}