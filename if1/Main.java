package if1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("elige un numero para tu rifa del 1 al 100");

        int t = sc.nextInt();

        Iff1 if1 = new Iff1();

        if1.Condicion1(t);

        System.out.println("sigue participando para mas rifas");
    }
}