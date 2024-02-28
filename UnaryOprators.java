import java.util.Scanner;

public class UnaryOprators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Initial value of a: " + a);
        System.out.println("Unary Plus: " + (+a));
        System.out.println("Unary Minus: " + (-a));
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));
        System.out.println("Final value of a: " + a);
        System.out.println("Pre-decrement: " + (--a));
        System.out.println("Post-decrement: " + (a--));
        System.out.println("Final value of a: " + a);
        System.out.println("Logical Complement: " + (!true));
        System.out.println("Bitwise Complement: " + (~a));
    }
}
