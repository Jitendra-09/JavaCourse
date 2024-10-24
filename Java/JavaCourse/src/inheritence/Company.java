package inheritence;

public class Company {
	String Name;
	int EmpId;
	
	public void setDetails(String Name, int EmpId) {
		this.Name=Name;
		this.EmpId=EmpId;
		
	}
	
	public void getDetails() {
		System.out.println(Name);
		System.out.println(EmpId);
	}

}
