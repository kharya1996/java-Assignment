import java.util.Scanner;

public class Compound_interest {
	
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double amount; 
		double principal; 
		double rate; 
		double time;
		
		System.out.println("Enter the Principal Amount :");
		principal = input.nextDouble();
		
		System.out.println("Enter the interest Rate :");
		rate = input.nextDouble();
		
		System.out.println("Enter the Time Period :");
		time = input.nextDouble();
		
		// amount = principal * (1 * rate / 100)^time
		
		amount = principal * Math.pow(1 + rate / 100 , time );
		
		System.out.println("The compound Interest :" +amount);
		
	}


}
