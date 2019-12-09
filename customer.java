
public class customer {
	
	private String first;			//holds the customer's first name
	private String second;			//holds the customer's last name
	private String email;			//holds the customer's email
	private double spent;			//holds the amount the customer spent
	
	
	
	public customer(String first, String second, String email, double spent) {
		this.first = first;
		this.second=second;
		this.email = email;
		this.spent=spent;
	}
	
	
	public String getName() {		//method to get the customer's name
		return first+" " + second;
		
	}
	
	public String getEmail() {		//method that returns the customer's email
		return email;
		
	}
	
	public double getSpent() {		//method that returns how much the customer spent
		
		return spent;
	}
	
	public void addSpent(double x) {	//method to add to how much the customer spent
		spent +=x;
		
	}
	

}
