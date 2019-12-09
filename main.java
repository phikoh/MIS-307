import java.util.*;
import java.io.*;


public class main {
	
	
	
	public static void main (String args []) throws FileNotFoundException, IOException {
		
		Scanner scan = new Scanner (System.in);		//scanner to read in the user's input
		String password = "password";				//password for the manager's account
		boolean close = false;						//boolean to close the program
		String input;								//string for the user's input
		
		File read = new File("accounts.txt");		//file for all of the customer accounts
		Scanner acct = new Scanner(read);	//scanner to initialize the customer's accounts		
		
		//initialize the customer's accounts before running the main program
		String first;		//holds the customer's firstname from the text file
		//System.out.println(first);
		String second;		//holds the customer's last name from the text file
		String email;		//holds the customer's email from the text file
		double spent;		//holds the amount spent from the text file
		ArrayList<customer> culist = new ArrayList<customer>( );		//arraylist of all the customer accounts

		while (acct.hasNext()) {		//loop to read in all of the customer accounts
			first=acct.next();			//first line of file should be customer first name
			second=acct.next();			//second line of file should be last name
			email = acct.next();		//third line should be email
			spent = acct.nextDouble();	//fourth line should be amount spent
			culist.add(new customer(first, second, email, spent));	//create a new customer object from the variables that were read in from the accounts file
		}
		
		File movies = new File("movie_data.txt");		//file for all of the movies
		Scanner movie = new Scanner(movies);		//scanner to initialize the movies
		
		
		String title;			//holds the moivie's title form the file
		double price;			//holds the movie's price form the file
		int theaterNumber;		//holds the movie's theater number from the file
		String rating;			//holds the movie's rating from the file
		ArrayList<movies> movlist = new ArrayList<movies>();			//arraylist of all of the movies
		
		
		while (movie.hasNext()) {								//loop to read in all of the movies and initialize them as opbjects in the arraylist
			movie.nextLine(); 									//have to iterate because of the white space
			title = movie.nextLine();							//first line should be the movie's title
			price = Double.parseDouble(movie.nextLine());				//second line should be the price
			theaterNumber = Integer.parseInt(movie.nextLine());			//third line should be the theater number	
			rating = movie.nextLine();							//fourth line should be the rating
			movlist.add(new movies (title, price, theaterNumber, rating));	//add the movie to the arraylist with the paramaters that were just read in 
			
		}
		
		
		
		
		
		
		
		
		String accountName;
		String acctFirst;
		String acctLast;
		
		
		
		//System.out.println(culist.get(0).getEmail());
		
		
		
		while (!close){
			System.out.println("Welcome to the theater program");
			System.out.println("Enter M or C for manager or customer acccount");
			System.out.println("Enter E to close the program");
			System.out.println("Enter A to make a new account");
			input=scan.next();
			if (input.contentEquals("M")){			//logic path for manager
				System.out.println("Enter Password");
				input=scan.next();
				if (input.equals(password)) {
					System.out.println("Wecome manager!");
					System.out.println("Enter R to run a report on the customers");
					System.out.println("Enter M to see a list of the movies");
					System.out.println("Enter Q to exit the program");
					System.out.println("Enter A to manually enter a movie");
					while(!close) {
						input=scan.next();
						
						
						if (input.equals("R")) {				//if the user enters R print out a list of the customer's name and their amount spent
							for (int i=0; i<culist.size(); i++) {
								System.out.print(culist.get(i).getName() + " Amount Spent $");
								System.out.println(culist.get(i).getSpent());
								System.out.println();
								
							}
						}
						else if(input.equals("M")) {		//if M is entered, print put the movie names and the price of them
							
							for (int i = 0; i<movlist.size(); i++) {
							
							System.out.print(movlist.get(i).getName());
							System.out.println("  $" + movlist.get(i).getPrice());
							System.out.println();
							
							}
						}
						else if (input.equals("Q")) {		//sets boolean to true, closes the program
							close=true;
							System.out.println("Closing the program");
						}else if (input.contentEquals("A")) {
							scan.nextLine();
							System.out.println("Enter the movie title");
							String x1 = scan.nextLine();
							System.out.println("Enter the movie's price");
							double x2 = scan.nextDouble();
							System.out.println("Enter the movie's theater number");
							int x3 = scan.nextInt();
							scan.nextLine();
							System.out.println("Enter the movie's rating");
							String x4 = scan.nextLine();
							
							
							movlist.add(new movies(x1,x2,x3,x4));
							
							
							
						}
						System.out.println("Enter R to run a report on the customers");
						System.out.println("Enter M to see a list of the movies");
						System.out.println("Enter Q to exit the program");
					}
					
				}else {
					System.out.println("wrong password");
				}
			}
			if (input.equals("C")) {					//for the customer account
				System.out.println("Please enter your account name");
				acctFirst=scan.next();
				acctLast=scan.next();
				accountName=acctFirst + " " + acctLast;
				boolean selected2 = true;
				
				for (int i = 0; i<culist.size(); i++) {
					if (accountName.contentEquals(culist.get(i).getName())) {		//try to find the username in the arraylist
						selected2=false;
						while(!close) {		//if a match was found, enter the program
							System.out.println("welcome to the customer program");
							System.out.println("Enter M to see a list of the movies and their price");
							System.out.println("Enter P to select the movie that you would like to see");
							System.out.println("Enter Q to quit the program");
							
							
							input=scan.next();
							
							if (input.contentEquals("M")) {					//prints out the movie, the theater number and the price
								for (int x = 0; x<movlist.size(); x++) {
									System.out.print(movlist.get(x).getName() + " theater number " + movlist.get(x).getTheater());
									System.out.println(" Rating " + movlist.get(x).getRating() + "  $" + movlist.get(x).getPrice());
									System.out.println();
									}
							}
							if(input.equals("P")) {
								System.out.println("Please enter the theater number of the movie you wish to see");
								input=scan.next();
								boolean selected = true;
								for (int x=0; x<movlist.size(); x++) {
									if (Integer.parseInt(input)==movlist.get(x).getTheater()) {//if the movie theater is found, add the total to the amount spent and print out the movie name
										culist.get(i).addSpent(movlist.get(x).getPrice());
										System.out.println("you have selected "+ movlist.get(x).getName());
										selected=false;
									}
									if ((x+1)==movlist.size()&& selected) {		//if the movie theater is not found display message
										System.out.println("that theater does not exist");
									}
									
								}
								
							}
							if(input.contentEquals("Q")) {		//if the user enters q, the program quits
								close=true;
								System.out.println("Closing the program");
								
							}
							
							
						}
						
						
					}
					if (i+1== culist.size()&&selected2) {				//if the user name was not found in the list
						System.out.println("Wrong user name, or not in the system");
					}
					
				}
				
				
				
				
			}
			
			
			
			if (input.equals("Q"))	{	//Exits the program by setting the boolean to true
				close=true;
				System.out.println("Closing the program");
			}
			if (input.contentEquals("A")) {
				System.out.println("Enter your First Name");
				String m1 = scan.next();
				System.out.println("Enter your last Name");
				String m2= scan.next();
				System.out.println("Enter your email address");
				String m3=scan.next();
				int m4=0;

				
				culist.add(new customer(m1, m2, m3, m4));		//construsts a new customer with the input
				System.out.println("New Accunt Created!");
				
				
			}
		}
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		//Should only run after the user has exited the program
		
		if (close) {			//when the program is ended, the two arraylists have to be written to their respective files
			FileWriter fileacct = new FileWriter("accounts.txt");			//file writer for the accounts
			PrintWriter printAcct = new PrintWriter(fileacct);				//print write for the accounts
			
			for (int i = 0; i<culist.size(); i++) {					//for each of the items in the arraylist
				printAcct.println(culist.get(i).getName());			//get the name of the customer and write to file
				printAcct.println(culist.get(i).getEmail());			//get the customer's email and print it to the file
				printAcct.println(culist.get(i).getSpent());			//get the amount spent and write it to the file
				printAcct.println();								//write a blank line to the file
			}
			
			FileWriter filemov = new FileWriter("movie_data.txt");
			PrintWriter printMov = new PrintWriter(filemov);			
			
			for (int i =0; i<movlist.size(); i++) {					//for each of the items in the movie arraylist
				printMov.println();   								//print blank line in beginning
				printMov.println(movlist.get(i).getName());			//Print the name of the movie
				printMov.println(movlist.get(i).getPrice());		//print the price of the movie
				printMov.println(movlist.get(i).getTheater());		//print the theaternumber
				printMov.println(movlist.get(i).getRating());		//print the movie's rating
			
			}
			
			
			//Close all of the objects that should be closed
			fileacct.close();
			filemov.close();
			printAcct.close();
			printMov.close();
			scan.close();
			acct.close();
			
			
			
			
			
		}
		
	
			
		
		
		
		
		
	}

}
