import java.util.Scanner;

public class stringReversalRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        reverse(charArray, 0, charArray.length - 1);
        System.out.println("The reversed string is: " + new String(charArray));
    }

    static void reverse(char[] charArray, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        reverse(charArray, start + 1, end - 1);
    }
}
