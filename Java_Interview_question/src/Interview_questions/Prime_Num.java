package Interview_questions;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Printing prime number till 7
		for (int j = 0; j<=7; j++)
		{
			if (j%2 !=0)
			
			System.out.println(j);
			
		}
		//Printing prime number after 7
		
		for (int i=7; i<=100; i++ )
		{
					if ((i%2 !=0) & (i%3!=0) & (i%5 !=0) & (i%7!=0))
					    	
				System.out.println(i);
		}
			

	}

}
