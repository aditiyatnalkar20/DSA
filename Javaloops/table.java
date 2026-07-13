package Javaloops;

import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int a = num * i;
            System.out.println(a);

        }
        sc.close();
    }

}
