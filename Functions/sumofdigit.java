package Functions;

import java.util.*;

public class sumofdigit {

    public static int digits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num ");
        int n = sc.nextInt();

        System.out.println("sum of digits is: " + digits(n));

        sc.close();

    }
}
