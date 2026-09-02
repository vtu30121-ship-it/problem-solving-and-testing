import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return new PerformOperation() {
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
    }

    public PerformOperation isPrime() {
        return new PerformOperation() {
            public boolean check(int a) {

                if (a < 2) {
                    return false;
                }

                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if (a % i == 0) {
                        return false;
                    }
                }

                return true;
            }
        };
    }

    public PerformOperation isPalindrome() {
        return new PerformOperation() {
            public boolean check(int a) {

                int original = a;
                int reverse = 0;

                while (a > 0) {
                    int digit = a % 10;
                    reverse = reverse * 10 + digit;
                    a = a / 10;
                }

                return original == reverse;
            }
        };
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {

        MyMath myMath = new MyMath();

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int choice = sc.nextInt();
            int number = sc.nextInt();

            boolean result;

            if (choice == 1) {

                result = myMath.checker(
                    myMath.isOdd(), number
                );

                if (result)
                    System.out.println("ODD");
                else
                    System.out.println("EVEN");

            } else if (choice == 2) {

                result = myMath.checker(
                    myMath.isPrime(), number
                );

                if (result)
                    System.out.println("PRIME");
                else
                    System.out.println("COMPOSITE");

            } else if (choice == 3) {

                result = myMath.checker(
                    myMath.isPalindrome(), number
                );

                if (result)
                    System.out.println("PALINDROME");
                else
                    System.out.println("NOT PALINDROME");
            }
        }

        sc.close();
    }
}
