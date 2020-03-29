package bankChallenge;

public class VipCustomer {
	private String name;
	private String eMail;
	private double creditLimit;
	
	public VipCustomer() {
		this("default name",50000.0,"default@mail");
	}
	public VipCustomer(String name, double creditLimit)
	{
		this(name,creditLimit,"unknown@mail.com" );
	}
	public VipCustomer(String name,double creditLimit, String eMail)
	{
		this.name=name;
		this.eMail=eMail;
		this.creditLimit=creditLimit;
	}
	
	
	public String getName() {
		return name;
	}
	public String geteMail() {
		return eMail;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	

}
