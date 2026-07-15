package Functions;

import java.util.*;

public class bintodec {

    public static int bintodeci(int n) {

        int deci = 0;
        int power = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            deci = deci + (lastdigit * (int) Math.pow(2, power));
            power++;
            n = n / 10;
        }
        ;
        return deci;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter decimal number ");
        int n = sc.nextInt();
        System.out.println("the decimal number is " + bintodeci(n));
        sc.close();
    }
}
