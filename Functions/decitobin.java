package Functions;

import java.util.*;

public class decitobin {

    public static int binary(int n) {

        int bin = 0;
        int power = 0;

        while (n > 0) {
            int lastdigit = n % 2;
            bin = bin + (lastdigit * (int) Math.pow(10, power));
            power++;
            n = n / 2;
        }
        ;
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter decimal number ");
        int n = sc.nextInt();
        System.out.println("the binary number is " + binary(n));
        sc.close();
    }

}
