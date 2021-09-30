
public class Functions {

	//Three types of Functions
	// Void function will return void
	// Function will not accept parameter but return value
	// Function will accept parameter and return value
	
	public void test()
	{
		System.out.println("This is test function");
	}
	
	public int Hang()
	{
		return 5;
	}
	public int addition(int a, int b)
	{
		int x, y, z;
		x = a;
		y = b;	
		z = (x+y);
		return z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Functions ff = new Functions();
			ff.test();
			int r = ff.Hang();
			System.out.println(r);
			int s = ff.addition(34,45);
			System.out.println(s);
	}

}
