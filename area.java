import java.util.*;

public class area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1.) Find the area of radius of circle.
        float radius = sc.nextFloat();
        final float PI = 3.14F; // for constant final keyword is used

        float area = PI * radius * radius;

        System.out.println("Area of circle = " + (area));

        // 2.) Print the given number is prime number or not.
        boolean count = false;
        for (int i = 2; i < n / 2; ++i) {
            if (n % i == 0) {
                count = true;
                break;
            }
        }
        if (!count) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

    }
}
