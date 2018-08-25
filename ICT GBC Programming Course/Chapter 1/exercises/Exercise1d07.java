package exercises;
/** 
 * @author Kasper Heydorn Koopmann
 * 
 * Exercise 1.07
 * Determine the order of evaluation of the operators in each of the following
 * Java statements, and try to figure out what the value of x, y, and z will be.
 * Then check if you were right by implementing a Java program that prints
 * out the values after running the statements.
 * 
 */

public class Exercise1d07 
{
	public static void main(String[] args)
	{
		
		int x = (7 + 3 * 6 / 2 - 1),
			y = (2 % 2 + 2 * 2 - 2 / 2),
			z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ))));
		
		System.out.println(x);
		System.out.println(y);
		System.out.print(z);
		
	}
}

