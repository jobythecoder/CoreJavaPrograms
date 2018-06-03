package testcases;

public class ReverseInteger {
	
	public static void main(String args[]) {
		
		//1. using analog
		int num = 123456789; //output 54321
		int rev =0;
		
		while (num !=0) {
			rev = rev * 10 + num % 10;
			num = num /10;
		}
		
		System.out.println("Reverse num is::"+ rev);
		
		//2.using StringBuffer method
		long num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
			
		
	}

}
