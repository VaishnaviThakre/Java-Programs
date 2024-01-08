class Test
{
	public int x,y;
	public static int z;

	public Test()
	{
		x = 45;
		y = 55;
		z = 65;
	}
}

public class staticExample1 {

    
    public static void main(String[] args) {
        Test t1 = new Test();
		System.out.println("x = " + t1.x);
		System.out.println("y = " + t1.y);
		System.out.println("z = " + Test.z);
        
    }
    
}
