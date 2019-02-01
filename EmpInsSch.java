package com.cg.eis.service;

import com.cg.eis.beans.Employee;

public  class EmpInsSch implements EmployeeServiceInterface{
	
	@Override
	public String schemeGenerator(int salary) {
		String Designation = null; 
		if(salary>5000 && salary<10000)
		{
			Designation="System Associate"+" "+"ScheC";	
		}
		else if(salary>10000 && salary<=40000)
		{
			Designation="Programmer"+" "+"ScheB";
		}
		else if(salary>40000)
				{
				Designation="Manager"+" "+"ScheA";
				}
		else if(salary<5000)
				{
				Designation="Clerk "+" "+"Nosche";
				}
		return Designation;
	}

}
