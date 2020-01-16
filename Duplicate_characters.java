import java.util.Scanner;

public class Duplicate_characters {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.println("Enter Any String :");
		str =input.nextLine();
		char[] temp = str.toCharArray();
		
		for(int i=0; i< str.length(); i++) {
			
			for(int j =i+1; j<str.length(); j++ ) {
				
				if (temp[i] == temp[j]) {
				
				System.out.print(temp[j]+ " ");
				break;
			}
		}
		
		
	}

	}}
