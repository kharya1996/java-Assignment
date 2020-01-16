import java.util.Scanner;

public class Duplicate_characters {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		String input_String;
		
		System.out.println("Enter Any String :");
		input_String =input.nextLine();
		char[] temp = input_String.toCharArray();
		
		for(int i=0; i< input_String.length(); i++) {
			
			for(int j =i+1; j<input_String.length(); j++ ) {
				
				if (temp[i] == temp[j]) {
				
				System.out.print(temp[j]+ " ");
				break;
			}
		}
		
		
	}

	}}
