import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		int Num_1 ,Num_2, Result;
		String symbol, toContinue;
		
			
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("CALCULATOR:-");
			System.out.println("Enter the first No:");
			Num_1 = input.nextInt();
			
			System.out.println("Enter the Second No:");
			Num_2 = input.nextInt();
			
			System.out.println("Enter the operation ( + , - , * , / ) ");
			symbol = input.next();
			
			switch(symbol) {
			
			case"+":Result = Num_1 + Num_2;
				System.out.println("Result Addition is " +Result);
				break;
			
			case"-": Result = Num_1 - Num_2;
				System.out.println("Result Subtraction is " +Result);
				break;
			
			case"/": if(Num_2!=0) {
				Result = Num_1 / Num_2;
				System.out.println("Result Divison is " +Result);
			}else {
				
				System.out.println("Number Can't Divide by 0");
			}
				break;
			case"*": Result = Num_1 * Num_2;
				System.out.println("Result Multiplication is " +Result);
				break;
			default:System.out.println("Input is invalid");
			break;
			
			}
			System.out.println("Do you want do more operation Press Y for YES  or N for No ");
			toContinue = input.next();
			
		}
			while(toContinue.equals("y") || toContinue.equals("Y") );
		
		
				
		
		}	
		
		
	}


