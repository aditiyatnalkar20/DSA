package AdvPatterns;

import java.util.*;

public class invrothalfpyrmd {

    public static void inv_rot_half_pyrmd(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n  ");
        int n = sc.nextInt();
        inv_rot_half_pyrmd(n);

        sc.close();

    }

}
