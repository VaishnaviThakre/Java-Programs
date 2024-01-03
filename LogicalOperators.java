import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter another value: ");
        int b = sc.nextInt();
        boolean c = true;
        boolean d = false;
        System.out.println("a > b && a < 10: " + (a > b && a < 10));
        System.out.println("a > b || a < 10: " + (a > b || a < 10));
        System.out.println("!(a > b): " + !(a > b));
        System.out.println("c && d: " + (c && d));
        System.out.println("c || d: " + (c || d));
        System.out.println("!c: " + !c);
    }
}
