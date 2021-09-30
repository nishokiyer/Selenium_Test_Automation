
public class String_concatination {

	public static void main(String args[])
	{
		//+ sign is concatination operator
		String x = "Hello";
		String y = "World";
		int i = 100;
		int j = 200;
		double c = 12.33;
		double d = 10.33;
		// Always from Left to right the calculation happens.
		System.out.println(x + y);
		System.out.println(i+j);
		System.out.println(x+y+i+j);
		System.out.println(i+j+x+y);
		System.out.println(x+y+(i+j));
		System.out.println(i+j+x+y+i+j);
		System.out.println(c + d + x + y + c + d);
	}
}
