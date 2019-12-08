package project;

import java.util.ArrayList;

public class Accounts extends Customer{

	public Accounts(String CustomerName, String CustomerNum, boolean isMember) {
		super(CustomerName, CustomerNum, isMember);
	}
	
	private ArrayList<String> accountNums = new ArrayList<String>();

	public void addAccount() {
		if(isMember == true) {
			accountNums.add(CustomerNum);
		}else {
			return;
		}
	}
	
	public void removeAccount() {
		accountNums.remove(CustomerNum);
	}
	
}
