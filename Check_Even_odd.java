import java.util.Scanner;

public class Check_Even_odd {
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter any no. ot find Even or odd   ");
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		
		if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");

}

	}


