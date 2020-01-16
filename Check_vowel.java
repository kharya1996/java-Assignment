import java.util.Scanner;

public class Check_vowel {
	
	public static void main(String[] args) {
		
		char ch;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Character to check it's vowel ");
		ch = input.next().charAt(0);
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
			
			System.out.println(ch +":Is a Vowel");
		}
		else {
			System.out.println( ch +":Is a Consonant" );
		}

}

}
