import java.util.Scanner;

public class staticExample2 {
    static int x = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, z;

        System.out.println("Enter value of y: ");
        y = sc.nextInt();
        System.out.println("Enter value of z: ");
        z = sc.nextInt();
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
        System.out.println("Value of z is: " + z);
    }
}
