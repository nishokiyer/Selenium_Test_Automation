
public class Looping_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1; // initialization
		while(i<=100)//conditional operator
		{
			System.out.println("Print the value of i : " + i);
			i = i+1;// increment operator
		}
		System.out.println("******************");
		for (int j=100;j>=-10; j --) //(initialization; conditional operator, increment operator)
		{
			System.out.println("Print the value of j : " + j );
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		//Post increment
		int R = 1;
		int S = R++;
		System.out.println("Value of R in Post increment "+ R);
		System.out.println("Vslue of S in Post increment "+ S);
				
		//Pre increment
		int U = 1;
		int V = ++U;
		System.out.println("Value of U in Pre increment "+ U);
		System.out.println("Vslue of V in Pre increment "+ V);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//Post increment
		int P = 2;
		int Q = P--;
		System.out.println("Value of P in Post decrement "+ P);
		System.out.println("Vslue of Q in Post decrement "+ Q);
						
		//Pre increment
		int M = 2;
		int N = --M;
		System.out.println("Value of M in Pre decrement "+ M);
		System.out.println("Vslue of N in Pre decrement "+ N);
	}	
}
