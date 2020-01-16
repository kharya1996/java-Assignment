import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
	
		String input_string, reverse = "";
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any String to Reverse");
		input_string = input.nextLine();
		String a[] = input_string.split(" ");
		
		for(int i =a.length-1; i>=0; i--) {
			
			reverse = reverse + a[i] + " ";
			
		}
		
		System.out.print(reverse);	

	}

}
