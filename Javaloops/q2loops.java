package Javaloops;

import java.util.*;

public class q2loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of numbers : ");
        int num = sc.nextInt();

        int evensum = 0;
        int oddsum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println("enter" + i + "number : ");
            int a = sc.nextInt();

            if (a % 2 == 0) {
                evensum += a;
            } else {
                oddsum += a;
            }
        }
        System.out.println("evensum is:" + evensum);
        System.out.println("oddsum is:" + oddsum);

        sc.close();
    }

}
