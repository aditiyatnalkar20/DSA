package Functions;

import java.util.*;

public class average {

    public static double Average(double a, double b, double c) {
        double averagee = (a + b + c) / 3;
        return averagee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("averge is " + Average(2, 4, 6));

        sc.close();
    }

}
