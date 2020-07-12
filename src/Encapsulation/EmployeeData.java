package Encapsulation;

public class EmployeeData {

	// How to implement encapsulation:

	// Encapsulation is also called as data hiding
	// Private data variables: so that these var cannot be accessed directly
	// from ouside of class

	private int ssn;
	private String ename;
	private int age;

	public static void main(String[] args) {

		EmployeeData emp = new EmployeeData();
		emp.setEname("kesava");
		emp.setage(24);
		emp.setSsn(1234);

		System.out.println("Employee name is : " + emp.getEname());
		System.out.println("Employee age is : " + emp.getage());
		System.out.println("Employee ssn no is : " + emp.getSsn());

	}

	// Public getter and setter methods : To set & get values of a fields.

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

}
