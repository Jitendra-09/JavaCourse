package interfaces;

public class NumTest implements Three{

	@Override
	public void greet() {
		System.out.println("greeting");
		
	}

	@Override
	public void wish() {
		System.out.println("Wishing");
		
	}

	@Override
	public void bye() {
		System.out.println("Bye");
		
	}
	
	

}
