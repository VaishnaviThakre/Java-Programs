
public class methodOverloading1 {

    public void print(int n, char c)
    {
        System.out.println("Integer is: "+n);
        System.out.println("Character is: "+c);
       
    }
    
    public void print(char c,int n)
    {
     System.out.println("Character is: "+c);
     System.out.println("Integer is: "+n);
     
    }
    public static void main(String[] args) {
        methodOverloading1 mo = new methodOverloading1();
        mo.print(1, 'a');
        mo.print('b', 2);
        
    }
    
}
