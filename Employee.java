package sample;

public class Employee {
	private String name ;
	private int salery ;
	private char gender ;
	private int empId ;
	private boolean isVaccinated ;
	private String role ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalery() {
		return salery;
	}
	public void setSalery(int salery) {
		this.salery = salery;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public boolean isVaccinated() {
		return isVaccinated;
	}
	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Employee(String name, int salery, char gender, int empId, boolean isVaccinated, String role) {
		super();
		this.name = name;
		this.salery = salery;
		this.gender = gender;
		this.empId = empId;
		this.isVaccinated = isVaccinated;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salery=" + salery + ", gender=" + gender + ", empId=" + empId
				+ ", isVaccinated=" + isVaccinated + ", role=" + role + "]";
	}
	

}
