package Functions;

import java.util.Scanner;

public class binCoeff {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;

    };

    public static int binCoefff(int n, int r) {
        int factn = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n - r);

        int binCoeff = factn / (factr * factnmr);

        return binCoeff;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        System.out.print("enter r ");
        int r = sc.nextInt();

        System.out.println(" binomial coefficient = " + binCoefff(n, r));
        sc.close();
    }

}
