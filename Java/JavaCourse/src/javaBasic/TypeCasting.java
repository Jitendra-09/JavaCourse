package javaBasic;

public class TypeCasting {

	public static void main(String[] args) {
		
// Widening casting (Automatically done ) low to high
		int x = 9;
		double y = x;
		
		System.out.println(x);
		System.out.println(y);

// Narrow Casting higher to low
		double a =7.9;
		int b = (int)a;
		
		System.out.println(a);
		System.out.println(b);
	}

}
