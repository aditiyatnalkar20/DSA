// display 1 to n natural numbers

package Javaloops;

import java.util.*;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        System.out.print("enter number ");
        int n = sc.nextInt();

        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
        ;
        sc.close();
    }
}
