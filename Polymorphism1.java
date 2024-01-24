import java.util.Scanner;

public class Polymorphism1 {
   
    
    public int Multiply(int a,int b)
    {
        return a*b;
    }
    public double Multiply(double a,double b)
    {
        return a*b;
    }
     

    
    public static void main(String[] args) {
        /*Scanner sc =new Scanner(System.in);
        System.out.println("Enter two nos.:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter two nos.:");
        double c = sc.nextDouble();
        double d = sc.nextDouble();*/
        
        Polymorphism1 p1 = new Polymorphism1();
        System.out.println(p1.Multiply(12, 23));
        System.out.println(p1.Multiply(34.4,43.3));
        
        
        
    }
    
}
