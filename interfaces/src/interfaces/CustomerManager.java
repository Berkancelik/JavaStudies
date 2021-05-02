package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	// loosly - tightly coupled

	public void add(Customer customer) {
		System.out.println("M��teri eklendi" + customer.getFirstName());
		
		Utils.runlogges(loggers, customer.getFirstName());
		
		
	
	}
	
	
	public void delete(Customer customer) {
		System.out.println("M��teri sislindi" + customer.getFirstName());
		
		Utils.runlogges(loggers, customer.getLastName());


	
	}

}
