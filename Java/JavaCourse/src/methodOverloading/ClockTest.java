package methodOverloading;

public class ClockTest {

	public static void main(String[] args) {
		Clock c1=new Clock();
		
		c1.setClock(5);
		c1.getClock();
		
		c1.setClock(4, 5);
		c1.getClock();
		
		c1.setClock(3, 5, 6);
		c1.getClock();
	}

}
