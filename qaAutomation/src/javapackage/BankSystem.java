package javapackage;

public class BankSystem {
	int bal= 5000;
	void balance ()
	{
		System.out.println("The current balance is $"+bal);
	}
	
	void deposit(int a)
	{
		 bal=bal+a;
		System.out.println("The update Balance is  $"+bal);
	}
	
	void withdraw(int a)
	{
		bal = bal -a;
		System.out.println("The amount after withdraw is $"+bal);
	}

	public static void main(String[] args) {
		// Create an object .Here oj is the reference/Instance of class . 
		BankSystem obj = new BankSystem();
		
		obj.balance();
		obj.deposit(5000);
		obj.withdraw(2000);
	}

}
