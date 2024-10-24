package methods;

public class MethodsInJava {

	public static void main(String[] args) {
	
		MethodsInJava obj1 =new MethodsInJava();
		obj1.sumOfNum(4);
		
		
		System.out.println(obj1.sumOfNUum1(50));
		

	}
	public void sumOfNum(int n) {
		int res = n*(n+1)/2;
		System.out.println(res);
	}
	
	public int sumOfNUum1(int n) {
		int res = n*(n+1)/2;
		
		System.out.print("Sum is:");
		return res;
	}

}
