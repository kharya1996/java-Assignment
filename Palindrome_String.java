import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		String str, reverse = "";
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any String to it's Palindrome");
		str = input.nextLine();
		
		for(int i = str.length()-1; i>=0; i--) {
		
			reverse = reverse + str.charAt(i);	
			
		}
		
		if(reverse.equals(str)) {
			
			System.out.println("This string is Palindrome");
		}
		else {
			
			System.out.println("This string is not a Palindrome ");
		}
		
		
		

	}

}
