import java.util.*;


public class main {
	
	
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner (System.in);		//scanner to read in the user's input
		String password = "password";				//password for the manager's account
		boolean close = false;						//boolean to close the program
		String input;								//string for the user's input
		Scanner acct = new Scanner("accounts.text");	//scanner to initialize the customer's accounts
		String accountName;
		
		
		//initialize the customer's accounts before running the main program
		String first;		//holds the customer's firstname from the text file
		String second;		//holds the customer's last name from the text file
		String name;		//holds the combined name 
		String email;		//holds the customer's email from the text file
		double spent;		//holds the amount spent from the text file
		int acctnum = 0;	//not sure yet
		
		
		
		while (acct.hasNext()) {		//
			
			first=acct.next();			//first line of file should be customer first name
			second=acct.next();			//second line of file should be last name
			name = first + " "+ second;	//Concatenate the names together
			email = acct.next();		//third line should be email
			spent = acct.nextDouble();	//fourth line should be amount spent
			 
			new customer(name, email, spent);	//create a new customer object from the variables that were read in from the accounts file
			
			
		}
		
		
		
		
		System.out.println("Welcome to the theater program");
		System.out.println("Enter M or C for manager or customer acccount");
		System.out.println("Enter E to close the program");
		
		while (!close){
			input=scan.next();
			if (input.contentEquals("M")){			//logic path for manager
				System.out.println("Enter Password");
				input=scan.next();
				if (input.equals(password)) {
					System.out.println("Wecome manager!");
					
					
				}else {
					System.out.println("wrong password");
				}
			}
			if (input.equals("C")) {
				System.out.println("Please enter your account number");
				accountName=scan.next();
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
