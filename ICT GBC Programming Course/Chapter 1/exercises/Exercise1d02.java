package exercises;
/**
 * @author Kasper Heydorn Koopmann
 * 
 * Exercise 1.02
 * Write a program that has the following String variables: firstName, middleName, and
 * lastName. Initialize these with your first, middle, and last names. The program should also
 * have the following char variables: firstInitial, middleInitial, and lastInitial. Store
 * your first, middle, and last initials in these variables. The program should display the contents
 * of these variables on the screen.
 * 
 */

public class Exercise1d02 
{
	public static void main(String[] args)
	{
		
		String firstName, middelName, lastName;
		char firstInitial,middelInitial,lastInitial;
		
		firstName 		= "Kasper";
		middelName 		= "Heydorn";
		lastName 		= "Koopmann";
		
		firstInitial	= 'K';
		middelInitial 	= 'H';
		lastInitial 	= 'K';
		
		System.out.println(firstName + " " + middelName + " " + lastName);
		System.out.print(firstInitial);
		System.out.print(middelInitial);
		System.out.print(lastInitial);
	}
	
}


