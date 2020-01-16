import java.util.Scanner;

public class Check_vowel {
	
	public static void main(String[] args) {
		
		char charValue;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Character to check it's vowel ");
		charValue = input.next().charAt(0);
		
		if(charValue == 'a' || charValue == 'A' || charValue == 'e' || charValue == 'E' || charValue == 'i' || charValue == 'I' || charValue == 'o' || charValue == 'O' || charValue == 'u' || charValue == 'U') {
			
			System.out.println(charValue +":Is a Vowel");
		}
		else {
			System.out.println( charValue +":Is a Consonant" );
		}

}

}
