package subjects;

/*
 *  This program shows how to use the Scanner class
 *  
 */

import java.util.Scanner; //Needed for the scanner class

public class Scanning
{
	public static void main(String[] args)
	{
		
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		System.out.print("How many hours did your work this week? ");
		hours = keyboard.nextInt();
		
		System.out.print("What is your hourly payrate? ");
		payRate = keyboard.nextDouble();
		
		grossPay = hours * payRate;
		
		System.out.println();
		System.out.println("Hello " + name +" :)");
		System.out.println("Your gross pay is " + grossPay + " kr");
	
	}
}