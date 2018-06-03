package testcases;

public class MissingNumber {
	public static void main(String args[]) {
		
		
		int a[]= {2,3,4,5,6,7}; // find the missing number?
		
		//1+2+4= 7
		//1+2+3+4=10
		//missing number is 10-7=3
		
		int sum1 =0;
		int sum2=0;

		int len=a.length;
		int lastdigit=a[len-1];
		
		for(int i=0; i<len;i++) {
			sum1= sum1+a[i];
		}
		
		for(int j=0;j<=lastdigit;j++) {
			sum2=sum2+j;  
		}

		
		// Find the missing number?
		
		int mnumber = sum2-sum1;
		
		System.out.println("The missing number is::"+mnumber);
		

		
	}

}
