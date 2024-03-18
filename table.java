import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1.) Print the sum of first n natural number input by the user.
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural number is " + sum);

        // 2.) Print the table of a number input by the user.
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        // 3.) Print all even numbers till n.
        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }

    }
}