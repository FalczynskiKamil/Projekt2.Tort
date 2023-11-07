package projekt.kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public static int dodaj(int a,int b) {
        Scanner dod = new Scanner(System.in);
        a = dod.nextInt();
        b = dod.nextInt();
        System.out.println(a+b);
        return 0;
    }
}
