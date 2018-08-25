package exercises;
/**
 * @author Kasper Heydorn Koopmann
 * 
 * Exercise 1.06
 * Write a program that calculates and prints the circumference and area of a
 * circle with radius 22.5. (Hint: The circumference of a circle is 2πr, the area is
 * πr2. The expression Math.PI gives a value for π).
 * 
 */

public class Exercise1d06 
{
	public static void main(String[] args)
	{
		double radius 	= 22.5;
		
		
		double circumf = (2 * Math.PI * radius);
		double area = (Math.PI * Math.pow(radius, 2));
		
		System.out.println("The circumference of the cirle is" + " " + circumf + "cm");
		System.out.println(" ");
		System.out.print("The area of the cirle is" + " " + area + "cm^2");
			
	}	

}

