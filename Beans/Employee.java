package Beans;

import lombok.Data;

@Data
public class Employee {
	private int eid;
	private String ename;
	private int eage;
	private String department;
	private double salary;
	public Employee(int eid, String ename, int eage, String department, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.department = department;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
}
