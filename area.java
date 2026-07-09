import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square  ");
        int side = sc.nextInt();
        int Area = side * side;
        System.out.println("The area of square is " + Area);
        sc.close();
    }
}
