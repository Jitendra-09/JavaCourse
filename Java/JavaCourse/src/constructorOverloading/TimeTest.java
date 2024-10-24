package constructorOverloading;

public class TimeTest {

	public static void main(String[] args) {

		
		Time t1=new Time(4);
		t1.getTime();
		
		Time t2 = new Time(5, 6);
		t2.getTime();

		Time t3 = new Time(4, 3, 5);
		t3.getTime();
	}

}
