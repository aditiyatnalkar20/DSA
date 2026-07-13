//sum of 1st n natural numbers
package Javaloops;

import java.util.*;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num ");
        int num = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= num) {
            sum = sum + counter;
            counter++;

        }
        System.out.print(sum);
        sc.close();
    }
}
