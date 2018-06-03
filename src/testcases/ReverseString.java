package testcases;

public class ReverseString {
	
	public static void main(String args[]) {
		
		// String is immutable and does not support reverse
		// StringBuffer is mutable and supports reverse
		
		String s = "Joby Joseph";
		String re = "";

//option-1
		int len = s.length();

		for (int i=len-1; i>=0; i--) {
			
			re =re + s.charAt(i);
			
		}
		
		System.out.println(re);
	
//option-2		

	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());

	}
	

}
