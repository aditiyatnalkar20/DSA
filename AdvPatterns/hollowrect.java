package AdvPatterns;

import java.util.*;

public class hollowrect {

    public static void hollow_rectangle(int totrow, int totcol) {
        // outer loop - rows
        for (int i = 1; i <= totrow; i++) {
            // then for each row - col
            for (int j = 1; j <= totcol; j++) {
                // for border numbers
                if (i == 1 || i == totrow || j == 1 || j == totcol) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            // for next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows ");
        int totrow = sc.nextInt();
        System.out.print("enter cols ");
        int totcol = sc.nextInt();

        hollow_rectangle(totrow, totcol);
        sc.close();

    }
}
