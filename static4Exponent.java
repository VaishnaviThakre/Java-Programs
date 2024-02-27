import java.util.Scanner;

public class static4Exponent {
    static class Calculator {
        static double PI = 3.14159265358979323846;

        static int power(int base, int exponent) {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        int result = Calculator.power(base, exponent);
        System.out.printf("%d raised to the power of %d is %d", base, exponent, result);
    }
}

