package testing;
import java.util.Scanner;
public class testing {

public static void main(String[] args) {
	System.out.println("agewhat is");
 	Scanner in = new Scanner (System.in);
 	int age = in.nextInt();
 	
 	if (age<=4)
 		{System.out.println("Kid");}
 	else {
 		System.out.println("not kid");
 	}
}
}
