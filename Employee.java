package com.cg.eis.beans;

public class Employee {
	private int EmpId;
	private String EmpName;
	private int Salary;
	private String InsScheme;
	private String Designation;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Salary=" + Salary + ", InsScheme=" + InsScheme
				+ ", Designation=" + Designation + "]";
	}
	public Employee(int empId, String empName, int salary,String designation,String insScheme) {
		super();
		EmpId = empId;
		EmpName = empName;
		Salary = salary;
Designation = designation;
InsScheme = insScheme;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	//public String getDesignation() {
		//return Designation;
	//}
	//public void setDesignation(String designation) {
		//Designation = designation;
//	
	


}
