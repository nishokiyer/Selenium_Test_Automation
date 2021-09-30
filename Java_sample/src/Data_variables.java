
public class Data_variables {
	//Primitive Data Types
	byte myNum_byte = 100;
	short myNum_short = 5000;
	long myNum_long = 15000000000L;
	float myNum_float = 5.75f;
	double myNum_double = 19.99d;
	//scientific number
	float f1 = 35e3f;
	double d1 = 12E4d;
	
	boolean isJavaFun = true;
	boolean isFishTasty = false;
	
	char a = 65, b = 66, c = 67;
	//Non primitive data type
	//A String in Java is actually a non-primitive data type, because it refers to an object. The String object has methods that are used to perform certain operations on strings.
	//Strings, Arrays, Classes, Interface,
	String greeting = "Hello World";
	
public static void main(String arg[])
{
	Data_variables dd = new Data_variables();
	
	System.out.println(dd.myNum_byte);
	System.out.println(dd.myNum_short);
	System.out.println(dd.myNum_long);
	System.out.println(dd.myNum_float);
	
	System.out.println(dd.isJavaFun);     // Outputs true
	System.out.println(dd.isFishTasty);   // Outputs false

	System.out.println(dd.myNum_double);
	System.out.println(dd.f1);
	System.out.println(dd.d1);
	
	System.out.println(dd.a);
	System.out.println(dd.b);
	System.out.println(dd.c);
	System.out.println(dd.greeting);
}

}
