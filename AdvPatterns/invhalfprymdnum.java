package AdvPatterns;

public class invhalfprymdnum {
    public static void invetred_half_pyrmd_num(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        invetred_half_pyrmd_num(6);
    }
}
