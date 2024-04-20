import java.util.*;

public class Functions {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String primeNumber(int a) {
        boolean flg = false;
        for (int i = 1; i <= a / 2; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flg = true;
                    break;
                }
            }
        }
        if (!flg) {
            return (" is a prime number");
        } else {
            return (" is not a prime number");
        }
    }

    public static int factorial(int a) {
        int fact = 1;
        if (a <= 0) {
            System.out.println("Invalid number");
            return -1;
        }
        for (int i = 1; i <= a; i++) {
            fact = multiply(fact, i);
        }
        return fact;
    }

    public static String evenOrNot(int a) {
        if (a % 2 == 0)
            return " is Even";
        else
            return " is Odd";
    }

    public static void table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("\nEnter the second number: ");
        int b = sc.nextInt();

        System.out.println("Multiplication of two number " + a + " and " + b + " is: " + multiply(a, b));
        System.out.println("Factorial of " + a + " is :" + factorial(a));
        System.out.println(a + evenOrNot(a));
        System.out.println(a + primeNumber(a));
        System.out.println("Table of " + a);
        table(a);

        // Testing the functions with some values
        sc.close();
    }
}
