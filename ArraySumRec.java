import java.util.Scanner;

public class ArraySumRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = findSum(arr, n);
        System.out.println("The sum of elements in the array is " + sum);
    }

    public static int findSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return (findSum(arr, n - 1) + arr[n - 1]);
    }
}

