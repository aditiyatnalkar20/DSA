package Functions;

import java.util.*;

public class evenodd {

    public static boolean iseven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num :");
        int n = sc.nextInt();
        System.out.println("num is even ? " + iseven(n));

        sc.close();
    }

}
