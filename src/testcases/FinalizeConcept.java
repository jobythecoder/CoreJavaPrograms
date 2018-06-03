package testcases;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("finalize method");
	}
	//finalize is a method
	//just before the garbage collector, finalize method will be called, just to clean up the memory objects.
	
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;
		f2=null;
		
	}
	
	

}
