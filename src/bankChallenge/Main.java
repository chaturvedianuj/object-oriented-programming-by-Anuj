package bankChallenge;

public class Main {

	public static void main(String[] args) {
		//Bank AnujAcc = new Bank();
	//	Bank AnujAcc= new Bank("123456789",0.00,"Anuj","anujchaturvedi@mails.com","+91 9027519567");
//		AnujAcc.setCustomerName("Anuj");
//		AnujAcc.setAccNo("123456789");
//		AnujAcc.setBalance(0.00);
//		AnujAcc.seteMail("anujchaturvedi@mails.com");
//		AnujAcc.setPhoneNo("+91 9027519567");
		
		
//		System.out.println(AnujAcc.getPhoneNo());
//		System.out.println(AnujAcc.getBalance());
//		AnujAcc.deposit(50000.0);
//		AnujAcc.withdraw(100.0);
//		
//		
//		Bank Ishikaacc =new Bank("Ishika","ishika@mail.com","12345");
//		System.out.println(Ishikaacc.getAccNo()+" name "+    Ishikaacc.getCustomerName());
		
		
		VipCustomer person1= new VipCustomer();
		System.out.println(person1.getName());
		
		VipCustomer person2= new VipCustomer("Anuj",250000.0);
		System.out.println(person2.getName());
		
		VipCustomer person3= new VipCustomer("Ishika",100.0,"ishika@mail.com");

		System.out.println(person3.getName());
		System.out.println(person3.geteMail());



		
	}

}
  