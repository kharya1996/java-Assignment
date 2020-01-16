import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		String user_input, reverse = "";
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any String to it's Palindrome");
		user_input = input.nextLine();
		
		for(int i = user_input.length()-1; i>=0; i--) {
		
			reverse = reverse + user_input.charAt(i);	
			
		}
		
		if(reverse.equals(user_input)) {
			
			System.out.println("This string is Palindrome");
		}
		else {
			
			System.out.println("This string is not a Palindrome ");
		}
		
		
		

	}

}
