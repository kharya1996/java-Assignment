import java.util.Scanner;

public class check_Leap_Year {
	
	public static void main(String[] args) {
		
		int year;
		System.out.println("Enter Year to chek its leap year");
		
		Scanner input = new Scanner(System.in);
		
		year = input.nextInt();
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			
			System.out.println("This is leap year");
			
		}
		else {
		
		System.out.println("This is not leap year");
		}

	}

}
