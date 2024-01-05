import java.util.Scanner;

public class decimalToBinaryRec {
    static int findBinary(int decimal) 
    {
        if (decimal == 0) {
            return 0;
        } else {
            return decimal % 2 + 10 * (findBinary(decimal / 2));
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = sc.nextInt();
        System.out.println("The binary equivalent of " + num + " is " + findBinary(num));
    }
}
