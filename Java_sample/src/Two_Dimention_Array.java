
public class Two_Dimention_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][] = new String[3][5];
		// Always rows and columns
		// Find the row count
		System.out.println(x.length);
		// Find the column count
		System.out.println(x[0].length);
		
		x[0][0] = "A0";
		x[0][1] = "B0";
		x[0][2] = "C0";
		x[0][3] = "D0";
		x[0][4] = "E0";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";

		System.out.println(x[2][2]);
		for (int rows = 0; rows < x.length; rows ++)
		{
			for (int columns = 0; columns < x[0].length; columns ++)
			{
				System.out.print(x[rows][columns] + " ");
			}
			System.out.println(" ");
			 			
		}
	}

}
    