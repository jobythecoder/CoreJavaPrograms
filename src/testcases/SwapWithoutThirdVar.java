package testcases;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 10;
		
		//1.using third var
		int t;
		
//		t=x;
//		x=y;
//		y=t;
		
		
		//2.without third var: using + operator
//		x= x+y;
//		y=x-y;
//		y=x-y;
//		
		
		//3.without third var: using * operator		
//		x= x*y;
//		y=x/y;
//		y=x/y;

		//4.without third var: using * operator
		x= x^y; //15-->1111
		y= x^y; //10 -->1010
		y= x^y; //5 -->0101

		System.out.println("x::"+x);
		System.out.println("y::"+y);

	}

}
