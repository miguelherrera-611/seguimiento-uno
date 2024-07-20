package If2;

import java.util.Scanner;

public class Maaain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("elige un caballo del 1 al 60");

        int t = sc.nextInt();

        Ifff2 if2 = new Ifff2();

        if2.Condicion2(t);

        System.out.println("suerte en tu proxima carrera");

    }
}