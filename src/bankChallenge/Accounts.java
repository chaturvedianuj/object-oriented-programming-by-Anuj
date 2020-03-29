package bankChallenge;

public class Accounts {
	private String accNo;
	private double balance;
	private String customerName;
	private String eMail;
	private String phoneNo;
	
	
	public Accounts(String accNo, double balance, String customerName, String eMail, String phoneNo) {
		System.out.println("Account constructor is called ");
		this.accNo = accNo;
		this.balance = balance;
		this.customerName = customerName;
		this.eMail = eMail;
		this.phoneNo = phoneNo;
	}
	public Accounts() {
		this("56789 ",2.50,"Default Name", "Default eMail","Default phoneNo");
		System.out.println("empty constructur called");
	}
	
	
	
	public Accounts(String customerName, String eMail, String phoneNo) {
		this("99999",100.55,customerName,eMail,phoneNo); 
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	void deposit(double depositBalance) {
		this.balance+=depositBalance;
		System.out.println("Current balane is "+this.balance +" amount deposited is "+depositBalance);
	}
	void withdraw(double withdrawAmount) {
		if(this.balance-withdrawAmount<0) {
			System.out.println("Only "+balance +" available cannot process furthur");
		}
		else {
			this.balance-=withdrawAmount;
			System.out.println("withdrawAmount "+ withdrawAmount+" processed, remaining balance "+this.balance);
		}
	}

}
