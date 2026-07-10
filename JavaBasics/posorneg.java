import java.util.*;

public class posorneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("Positive num");
        } else {
            System.out.print("Negative num");
        }
        sc.close();
    };
}
