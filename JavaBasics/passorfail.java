
//ternary operator
import java.util.*;

public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks ");
        int marks = sc.nextInt();

        String reportCard = marks >= 33 ? "Pass" : "Fsil";
        System.out.println(reportCard);
        sc.close();
    }
}
