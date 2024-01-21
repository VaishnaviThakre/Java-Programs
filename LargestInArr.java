import java.util.Scanner;

public class LargestInArr {
    

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Eneter array elemets: ");
        
        for(int i=0; i<n; i++)  
            {  
  
                arr[i]=sc.nextInt();  
            }  
      
        int max = arr[0];
        
        for(int i =0;i<n;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Largest no. in array "+max);
    }
    
}
