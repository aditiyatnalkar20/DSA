package Javaloops;

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number ");
        int a = sc.nextInt();

        boolean isprime = true;
        if (a == 2) {
            System.out.println("prime num");
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isprime = false;
                    break;

                }

            }

        }
        if (isprime) {
            System.out.println("prime num");
        } else {
            System.out.println("not prime num");
        }

        sc.close();
    }

}
