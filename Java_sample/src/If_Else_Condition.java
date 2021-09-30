
public class If_Else_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comparison operator
		//>, <, >=, =<
		// = assignment operator
		//== compare operator
		
		int a = 10 , b= 20;
		int c = a;
		if (a>b)
			System.out.println("a is the greatest");
		else 
			System.out.println("b is greatest");
		if(a==c)
		System.out.println("a and c are equal");
		
		//Greatest of 3 numbers
		
		int x, y,z;
		x = 10;
		y = 20;
		z = 30;
		if ((x >= y) & (x>=z))
		System.out.println("x is greatest" + x);
		else if (y >= z)
		System.out.println("y is greatest" + y);
		else 
		System.out.println("z is greatest"+z);


	}

}
