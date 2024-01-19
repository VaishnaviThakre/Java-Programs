
import java.util.Scanner;


public class ArraySeprationRec {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] oddArr = new int[size];
        int[] evenArr = new int[size];

        separateOddEvenRec(arr, oddArr, evenArr, 0, 0, 0);

        System.out.println("The odd array is: ");
        printArray(oddArr);
        System.out.println("The even array is: ");
        printArray(evenArr);
    }

    public static void separateOddEvenRec(int[] arr, int[] oddArr, int[] evenArr, int index, int oddIndex, int evenIndex) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] % 2 == 0) {
            evenArr[evenIndex] = arr[index];
            evenIndex++;
        }

        else {
            oddArr[oddIndex] = arr[index];
            oddIndex++;
        }

        separateOddEvenRec(arr, oddArr, evenArr, index + 1, oddIndex, evenIndex);
    }


    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
