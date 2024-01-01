import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.println("You entered: " + num1);

        System.out.print("Enter a double: ");
        double num2 = input.nextDouble();
        System.out.println("You entered: " + num2);

        System.out.print("Enter a boolean: ");
        boolean bool = input.nextBoolean();
        System.out.println("You entered: " + bool);

        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.println("You entered: " + str);

        input.close();
    }
}
