
// Coder name - Abhishek Kesharwani
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
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

        sc.close();
    }
}
