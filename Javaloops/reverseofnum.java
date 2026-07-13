//print reverse of number 
// package Javaloops;

// public class reverseofnum {
//     public static void main(String[] args) {

//         int a = 10988;
//         for (; a > 0; a = a / 10) {
//             int lastdigit = a % 10;
//             System.out.print(lastdigit);
//         }
//         ;

//     }
// }
package Javaloops;

public class reverseofnum {
    public static void main(String[] args) {
        int a = 10988;
        int rev = 0;
        while (a > 0) {
            int lastdigit = a % 10;
            rev = (rev * 10) + lastdigit;
            a = a / 10;
        }
        System.out.print(rev);
        ;
    }
}
