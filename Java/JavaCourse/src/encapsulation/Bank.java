package encapsulation;

public class Bank {
	

		
		public double Balance = 7000;
	
	public double getBalance(int pin) {
		if(pin == 3241) {
			
		return Balance;
		
		}else {
			System.out.println("inalid pin");
			return 0;
		}
	}
	
	public void setBalance(double deposite) {
		Balance = Balance+deposite;
//		return Balance;
	}

}
