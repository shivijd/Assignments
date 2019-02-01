package com.cgs.ei.pl;

import java.util.LinkedList;
import java.util.Scanner;

import com.cg.eis.beans.Employee;
import com.cg.eis.service.EmpInsSch;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> ls=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		Employee em;
		System.out.println("enter number of employees");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("employeeId details");
			int EmpId=sc.nextInt();
			System.out.println("employee name is");
			String EmpName=sc.next();
			System.out.println("employee salary is");
			int Salary=sc.nextInt();
			String[] temp=new EmpInsSch().schemeGenerator(Salary).split(" ");
			em=new Employee(EmpId,EmpName,Salary,temp[0],temp[1]);
			ls.add(em);
			System.out.println("employee details are"+ls);
		}

	}

}
