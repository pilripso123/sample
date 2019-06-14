
package class1;

import java.util.Scanner;

public class ID4
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the first String");
		String s1 = input.nextLine();
		System.out.println("Please enter the second String");
	 
		String s2 = input.nextLine();
	 
	 
	 
		String s1upper = s1.toUpperCase();
	 
		String s1lower = s1.toLowerCase();
	 
	 
	 
		//Print the uppercase of the first String
		System.out.println(" The upper case of " +  s1  + " is " + s1upper);
		//Print the lowercase of the first String
		System.out.println(" The lower case of " +  s1  + " is " + s1lower);
	 
		//Print the first String and the number of characters it contains
		System.out.println(" The first String is " + s1 + " with a length of " + s1.length() );
		//Print the second String and the number of characters it contains
		System.out.println(" The second String is " + s2 + " with a length of " + s2.length());
		//Print the first character in the first String
		System.out.println(" The first character in the first String is " + s1.charAt(0));
		//If the first String contains a space, print everything after the space.
		System.out.println(" The second word in the first String is " + s1.substring(s1.indexOf(" ")+1) );
	
	
		//If the second String contains a space, print everything after the space.
		if (s2.substring(s1.indexOf(" ") = -1)
		{
  
		 	System.out.println(" The second String does not contain but one word.");
		}
		else;
		{	
			System.out.println(s2.substring(s2.indexOf(" ")));
		}
 		//Allow the user to enter a String to use as the replacement in the first String.
 		System.out.println("Please enter the String the you would like to replace the second String in the first String with");
 		String s3 = input.nextLine();
 		//Replace the occurrences of the second String in the first String with the third String.
 		s3 = s1.replace(s2, s3);
 		System.out.println(s3);
	}
 
}


	
 