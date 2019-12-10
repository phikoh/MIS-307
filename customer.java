
//@author Phillip Kohler Marcus Heintschel

public class customer {
	
	private String username;		//holds the customer's username
	private String first;			//holds the customer's first name
	private String second;			//holds the customer's last name
	private String email;			//holds the customer's email
	private double spent;			//holds the amount the customer spent
	private int movieCount;			//holds the number of movies that the customer has seen
	
	
	
	public customer(String username, String first, String second, String email, double spent, int movieCount) {
		this.username=username;
		this.first = first;
		this.second=second;
		this.email = email;
		this.spent=spent;
		this.movieCount=movieCount;
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
	
	public int getCount() {				//method to get how many movies the customer has seen
		return movieCount;
	}
	
	public void countUp() {
		
		movieCount+=1;
	}
	
	public String getUser() {
		
		return username;
	}

}
