//@author Phillip Kohler Marcus Heintschel

public class movies {

	
	private String name;		//string variable to hold the name of the movie
	private  double price;			//doublbe variable to hold the price of the movie
	private int theaternumber; //integer to hold the number of the theater that the movie is showing in
	//make an arraylist
	//private String[] movieTimes;	//array to hold the times that the movie is being shown
	private String rating;		//holds the rating of the movie
	
	public movies(String name, double price, int theaternumber, String rating) {		//constructor of the movie object, name is name, price is price
		this.name = name;
		this.price = price;
		this.theaternumber = theaternumber;
		this.rating = rating;
	}
	
	public String getName() {		//method to return the name of the movie
		return name;
	}
	
	
	public double getPrice() {		//method to return the rice of the movie
		return price;
	}
	
	public void  changeprice(double x) {		//method to change the price of the movie
		
		price=x;
	}
	
	public void changeTheater(int x) {		//method to change the theater number
		theaternumber=x;
		
	}
	
	public int getTheater() {		//method to return the theater number
		return theaternumber;
	}
	

	
	public String getRating() {		//method to call the rating of the movie
		return rating;
		
	}
	
	
	
	
	
}