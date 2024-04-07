
// Coder name - Abhishek Kesharwani
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Prime number upto range
        System.out.println("Prime number upto range " + n);
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i + " is a prime number");
            }
            // else {
            // System.out.println(i + " is not a prime number");
            // }
        }
        System.out.println();
        System.out.println("Given number is prime or not");
        // Given number is prime or not
        boolean flg = false;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flg = true;
                    break;
                }
            }
        }
        if (!flg) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
}
