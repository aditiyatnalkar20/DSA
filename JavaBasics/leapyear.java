import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year ");
        int year = sc.nextInt();
        // if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
        // System.out.print("leap year");
        // } else {
        // System.out.print("not leap year");
        // }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("leap year");
                } else {
                    System.out.print("not leap year");
                }

            } else {
                System.out.print("leap year");
            }
        } else {
            System.out.print("not leap year");
        }

        sc.close();
    }
}