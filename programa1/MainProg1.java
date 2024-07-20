package programa1;

import java.util.Scanner;

public class MainProg1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos años crees que logro vivir Jeanne Calment, el hombre que mas vivio en el mundo?");

        int t = sc.nextInt();

        Programa1 prog = new Programa1();

        prog.progmm1(t);

        System.out.println("gracias por participar en esta encuesta");

    }
}
