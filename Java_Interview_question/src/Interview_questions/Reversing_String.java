package Interview_questions;

public class Reversing_String {

	public static void main(String args[])
	{
		String str = "Nishok";
		int len = str.length();
		char c[]  = new char[len];
		
		for(int i =0 ; i<len;  i++)
		{
			c[i] = str.charAt(i);
			 System.out.print(c[i]);
		
		}
		System.out.println("\n*********");
		
		for(int j = c.length-1; j>=0; j--)
		{
			System.out.print(c[j]);
		}
		
		
		
				
				
	}
}
