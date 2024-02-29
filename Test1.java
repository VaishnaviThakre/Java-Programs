
public class Test1 {
    interface Motorbike
    {
        public void speed();
        
        
    }
    
    interface Cycle
    {
        public void distance();
    }
    
    public void speed(){
        System.out.println("Speed of the motorbike is: 90 km/hr ");
    }
   
    public void distance()
    {
        System.out.println("Distance of cycle is: 50 meter");
    }
    public class Car{
        public void display()
        {
            System.out.println("Name of the car is: Thar");
        }
    }
    
    public class TwoWheeler extends Car{
        
    }

   
    public static void main(String[] args) {
        
        Test1 t = new Test1();
        t.distance();
        t.speed();
       
        
    }
    
}
