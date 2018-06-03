package testcases;

public class FinallyConcept {

	public static void main(String[] args) {
		
		test1();
	}
	//finally is a block
public static void test1() {
	try {
		System.out.println("inside test1 method");
		throw new RuntimeException("test");
	}catch(Exception e) {
		System.out.println("inside catch block");
	}
	
	finally   
	{
		System.out.println("inside finally block");
		
		//finally block will be executed after try block irrespective of exception.
	}
}

}
