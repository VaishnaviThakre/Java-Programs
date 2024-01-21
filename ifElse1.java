
import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        if (num >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
