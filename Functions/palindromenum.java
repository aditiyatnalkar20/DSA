package Functions;

import java.util.*;;

public class palindromenum {

    public static void palindrome(int n) {
        int og = n;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        if (og == rev) {
            System.err.println("palindrome num");
        } else {
            System.out.println("not a palindrome num");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int n = sc.nextInt();
        palindrome(n);

        sc.close();
    }

}
