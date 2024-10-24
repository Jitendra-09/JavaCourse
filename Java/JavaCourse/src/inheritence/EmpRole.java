package inheritence;

public class EmpRole extends Company{
	String role;
	String work;
	int Exp;
	public void getRole() {
		System.out.println(role);
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void getWork() {
		System.out.println(work);
	}
	public void setWork(String work) {
		this.work = work;
	}
	public void getExp() {
		System.out.println(Exp);
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	
	

}
