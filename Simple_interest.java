import java.util.Scanner;

public class Simple_interest {
	
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
		
		// S.I = principal * rate * time / 100 ;
		
		amount = principal * rate * time / 100;
		
		System.out.println("The simple innterest is :"+ amount);
		

	}

}
