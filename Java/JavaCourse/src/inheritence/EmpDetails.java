package inheritence;

public class EmpDetails {

	public static void main(String[] args) {
		
		EmpRole Emp1=new EmpRole();
		Emp1.setDetails("Jithu", 1246946);
		Emp1.setExp(3);
		Emp1.setRole("QA");
		Emp1.setWork("Testing");
		Emp1.getDetails();
		Emp1.getExp();
		Emp1.getRole();
		Emp1.getWork();
	}
}
