
public class StudInfo {

   public void Student(String name,int roll_no)
   {
       System.out.println("Name is: "+name);
       System.out.println("Roll no. is: "+roll_no);
   }
    public static void main(String[] args) {
        
        StudInfo si = new StudInfo();
        si.Student("John", 2);
                }
    
}
