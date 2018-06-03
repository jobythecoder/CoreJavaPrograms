package AbstractConcept;

public abstract class Bank {  
	
	int amt = 100; //non static variable
	final int rate = 10;
	static int loanRate=15;
	
			
	//abstract classes are faster than interfaces
	//partial abtraction
	//hiding the implementation logic - is called abstraction
	// Abs class can have abs methods and non-abs methods
	//cannot create the object of abstract class
	
	
	
	public abstract void loan(); //abstract method -- no method body

	public void credit() {
		System.out.println("Bank -- Credit"); // non-abstract method
						
	}
	
	public void debit() {
		System.out.println("Bank -- Debit");
	}
}
