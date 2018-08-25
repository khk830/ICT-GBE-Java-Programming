package exercises;
/**
 	@author Kasper Heydorn Koopmann
 
 	Exercise 1.05
 	In Denmark, the sales tax is 25%. Write a program that calculates and prints
 	the tax and the total price of items that before the added tax cost 80, 140, and
 	230 kr., respectively.
  
 */

public class Exercise1d05 
{
	public static void main(String[] args)
	{
		double 	SALES_TAX = 0.25; 			// (25 / 100 = 0.25) 
		
		int		price_1 = 80, 
				price_2 = 140, 
				price_3 = 230; 
				
		double 	total_1 = price_1 * SALES_TAX, 
				total_2 = price_2 * SALES_TAX, 
				total_3 = price_3 * SALES_TAX; 
		
		System.out.println(total_1 + price_1);
		System.out.println(total_2 + price_2);
		System.out.println(total_3 + price_3);
			
	}
}


