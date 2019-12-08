package project;

public class Customer {
	protected String CustomerName;
	protected String CustomerNum;
	protected boolean isMember;
	

	public Customer(String CustomerName, String CustomerNum, boolean isMember) {
		this.CustomerName = CustomerName;
		this.CustomerNum = CustomerNum;
		this.isMember = isMember;
	}
	
	public String getCustomerName() {
		return CustomerName;
	}
	
	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
	}
	
	public String getCustomerNum() {
		return CustomerNum;
	}
	
	public void setCustomerNum(String CustomerNum) {
		this.CustomerNum = CustomerNum;
	}
	
	public boolean getMembership() {
		return isMember;
	}
	
	

}
