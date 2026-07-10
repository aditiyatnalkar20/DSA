
//if else if
import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income:");
        double income = sc.nextInt();
        double tax;
        if (income < 500000) {
            tax = 0;
            System.out.println("No Tax");
        } else if (income >= 500000 && income < 1000000) {
            tax = income * (0.2);
            System.out.print("the tax is " + tax);
        } else {
            tax = income * 0.3;
            System.out.print("the tax is :" + tax);
        }
        sc.close();
    };
}
