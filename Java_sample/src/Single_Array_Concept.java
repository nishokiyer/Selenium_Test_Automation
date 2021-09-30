
public class Single_Array_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Advantage of Array: Multiple values stored in single variable of same type.
		//Lowest bound of array starts from 0
		//Highest bound of array end with n = n-1
		//one dimensional array
		//Disadvantage of Array: Array size is fixed in static array. - To over come this problem we use collections (Array list, Hash Table dynamic array).
		//Stores only similar data types - To over come this problem we use object array.
		int R[] = new int[3];
		R[0] = 45;
		R[1] = 4;
		R[2] = 6;
		
		System.out.println(R[2]);
		//To find size of array use the method length
		System.out.println(R.length);
		//To print all value in the array
		System.out.println("To print all values of Single Array using While loop");
		int j=0;
		while(j<R.length)
		{
			System.out.println(R[j]);
			j++;
		}
		//interview question 
		//If given array index value exceeds then ArrayIndexOutOfBoundsException is triggered.
		//System.out.println(R[4]);  
		System.out.println("Printing all values of single array using for loop");
		
		for(int k=0;k<R.length;k++)
		{
			System.out.println(R[k]);
		}
		System.out.println("Object array to add multiple data type values");
		// Object Array: To Store multiple types of data types
		Object obj[] = new Object[6];
		obj[0] = "Tom";
		obj[1] = 25;
		obj[2] = 12.33;
		obj[3] = "04/25/1981";
		obj[4] = 'M';
		obj[5] = "London";
		
		// print all values of the object using for loop
		
		for ( int h = 0; h<obj.length; h++)
		{
			System.out.println("Printing all the values of the obj array " + obj[h]);
		}
		
	}

}
