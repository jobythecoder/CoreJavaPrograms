package AbstractConcept;

public class BMW implements Car{
	
	// What is topcasting and downcasting?

	@Override
	public void start() {
		System.out.println("BMW-----start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW------stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW------refuel");
				
	}
	
	//can have non overriden method as well
	
	public void carSafety() {
		System.out.println("BMW----car safety");
	}


}
