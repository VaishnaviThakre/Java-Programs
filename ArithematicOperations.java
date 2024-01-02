import java.util.Scanner;

public class ArithematicOperations {
    
   
    public static void main(String[] args) {
        int ans;
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter First Value "); 
        int a = sc.nextInt();
        System.out.println("Enter Second Value");
        int b = sc.nextInt(); 
        
        System.out.println("Choose operation to perform");
        System.out.println("1-Addition \n2-Substraction \n3-Division \n4-Multiplication");
        int choice = sc.nextInt();
        ArithematicOperations ao = new ArithematicOperations();
        switch(choice)
        {
            case 1:
                ans = a+b;
                System.out.println(ans);
                break;
                
            case 2:
                ans = a-b;
                System.out.println(ans);
                break;
                
            case 3:
                ans = a/b;
                System.out.println(ans);
                break;
                
            case 4:
                ans = a*b;
                System.out.println(ans);
                break;
        }
        

       
    }
    
}
