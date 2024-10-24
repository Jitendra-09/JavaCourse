package methodOverriding;

public class PCMethodOverriding {

	public static void main(String[] args) {
		
//		case1
		P obj1 =new P();
		System.out.println(obj1.x);
		obj1.m1();
		
//		case2
		C obj2 = new C();
		System.out.println(obj2.x);
		obj2.m1();
		
//		case3
		P obj3=new C();
		System.out.println(obj3.x);
		obj3.m1();
		
		

	}

}
