import java.util.Scanner;

public class Alphabetical_order {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the No. of String You Want to arrange");
		
		int count = input.nextInt();
		
		String[] a = new String[count];
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter the String to Arrange:- ");
		
		for(int i = 0; i < count; i++ ) {
			
			a[i] = input2.nextLine();
		}
		
		System.out.print(" Your Strings are:-") ;
		
		for(int i=0; i<a.length; i++) {
			
			System.out.print(" "+a[i]);
			
				}
		
		String temp;
		
		for(int i = 0; i< a.length; i++) {
			
			for(int j = 0; j<a.length-1-i; j++) {
				
				if(a[j].compareTo(a[j+1]) > 0) {
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
				
			}
	
			
		}
		System.out.print("\n Arranged Strings are:-") ;
			for(int i=0; i<a.length; i++) {
		
		System.out.print(" "+a[i]) ;
		
			}
		

	}

}
