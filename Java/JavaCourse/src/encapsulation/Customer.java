package encapsulation;

public class Customer {

	public static void main(String[] args) {
		
		Bank cus=new Bank();
		System.out.println(cus.getBalance(3241));
		
		cus.setBalance(400.45);
		System.out.println(cus.getBalance(3241));

	}

}
