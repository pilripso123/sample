package class1;
//import scanner
import java.util.Scanner;
//class
public class HM1 
{
//string to recognize it is a string
	public static void main(String[] args)
	{ 
		//computer know its a scanner now by inputing new scanner
		Scanner input = new Scanner (System.in);
		
		//quarters for each game
		System.out.println("Please enter the name for the home team");
		String t1 = input.nextLine();
		
		
		System.out.println("Please enter the name for the visiting team");
		String t2 = input.nextLine();
		
		System.out.println("Please enter the score for the home team in the first quarter");
		int h1 = input.nextInt();
		
		System.out.println("Please enter the score for the visting team in the first quarter");
		int v1 = input.nextInt();
		
		System.out.println("Please enter the score for the home team in the second quarter");
		int h2 = input.nextInt();
		
		System.out.println("Please enter the score for the visting team in the second quarter");
		int v2 = input.nextInt();
		
		System.out.println("Please enter the score for the home team in the third quarter");
		int h3 = input.nextInt();
		
		System.out.println("Please enter the score for the visiting team in the third quarter");
		int v3= input.nextInt();
		
		System.out.println("Please enter the score for the home team in the fourth quarter");
		int h4 = input.nextInt();
				
		System.out.println("Please enter the score for the visiting team in the fourth quarter");
		int v4 = input.nextInt();
	
	
		//naming methods
		int h = h1 + h2 + h3 + h4;
		int v = v1 + v2 + v3 + v4;	
		
	
		// if else statements and conditions 
		if (h>v)
		{
			System.out.println("The home team " + t1 +",deafted the " + t2 + " by a score of " + h + " to " + v);		
		}		
		else if(v>h) 
		{		
			System.out.println("The visiting team " + t2 +",deafted the " + t1 + " by a score of " + v + " to " + h);
		}		
		if (h == v)
		{
			
			System.out.println(" The "+ t1 + " and " + t2 + " tied with a score of " + h + " to " + v);
		
			System.out.println("Please enter the score for the visiting team in the over time quarter");
			int v5 = input.nextInt();
			System.out.println("Please enter the score for the home team in the over time quarter");
			int h5 = input.nextInt();
		
	// nested in the if else
		int ho = h5;
		int vo = v5;
		
		if (ho>vo) 
		{			
			System.out.println("The home team " + t1 +",deafted the " + t2 + " by a score of " + ho + " to " + vo);
			
		}
		if (vo>ho)
		{
			System.out.println("The visiting team " + t2 +",deafted the " + t1 + " by a score of " + vo + " to " + ho);		
		}
	}
}
}

