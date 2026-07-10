
//if else if 
import java.util.*;

public class largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        if ((a >= b) && (a >= c)) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.print(c);
        }
        ;

        sc.close();
    }
}
