//write a java program to seprate odd and even integer into seprtate arrays without recurssion

import java.util.Scanner;


public class  ArraySeperation {

    
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

        separateOddEven(arr);
    }

    public static void separateOddEven(int[] arr) {
  
        int oddIndex = 0;
        int evenIndex = 0;

   
        int[] oddArr = new int[arr.length];
        int[] evenArr = new int[arr.length];

     
        for (int num : arr) {

            if (num % 2 == 0) {
                evenArr[evenIndex] = num;
                evenIndex++;
            }
            else {
                oddArr[oddIndex] = num;
                oddIndex++;
            }
        }

        System.out.println("The odd array is: ");
        printArray(oddArr, oddIndex);
        System.out.println("The even array is: ");
        printArray(evenArr, evenIndex);
    }

    public static void printArray(int[] arr, int size) {

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

