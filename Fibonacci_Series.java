
public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int num1 =0, num2 =1 ,Result;
		
		System.out.print(num1+" "+num2);
		for(int i = 0; i<=20; i++) {
			
			Result = num1 + num2;
			
			System.out.print(" "+Result);
			num1 = num2; 
			num2 = Result;
			
		} 
		
		
	}

}
