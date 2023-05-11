package javapackage;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b =20;
		int sum =a+b;
		int sub =b-a;
		int mut =a*b;
		int div =b/a;
		
		int mod =b%a;
		System.out.println("Total of two numbers"+sum);
		System.out.println("substraction of two numbers"+sub);
		System.out.println("multiplication of two numbers"+mut);
		System.out.println("division of two numbers"+div);
		
		System.out.println("modulus of two numbers"+mod);	
		
		
		BankSystem obj= new BankSystem ();
		obj.balance();

	}

}
