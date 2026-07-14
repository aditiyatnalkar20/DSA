package Patterns;

import java.util.*;

public class invertedstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        ;
        sc.close();
    }

}
// for (int j = num; j >= i; j--)
// or (int j = 1; j <= num - i + 1; j++)
