package AbstractConcept;

public interface Car {
	
	//only static and final variable
	//no need to declare the variable as final, it is final bydefault
	
	int a = 10;
	
	//Always define only abstract methods -- no method body
	//only method declaration
	//we achieve 100% abstraction
	//cannot create the object of interface class
	
	public void start();
	public void stop();
	public void refuel();

}
