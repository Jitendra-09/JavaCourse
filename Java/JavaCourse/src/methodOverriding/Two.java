package methodOverriding;

public class Two extends One{
	int x;
	
	public void putX(int x) {
		this.x=x;
	}
	public void greet() {
		System.out.println("Hi good evening");
	}
	public void showAll() {
		super.greet();
		System.out.println(x);
		System.out.println(super.x);
	}

}
