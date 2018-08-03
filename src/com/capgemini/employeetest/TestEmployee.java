package com.capgemini.employeetest;

import com.capgemini.employee.Employee;

/*class to test the Employee class*/
public class TestEmployee {

	public static void main(String[] args) {
		
		//instantiating the object of Employee class
		Employee firstEmployee = new Employee();
		System.out.println(firstEmployee);
		
		firstEmployee.setId(111);
		firstEmployee.setMonthlyBasic(17000.0);
		firstEmployee.setName("Mayur");
		
		System.out.println("Name: " + firstEmployee.getName());
		System.out.println("id: " + firstEmployee.getId());
		System.out.println("Basic Pay: " + firstEmployee.getMonthlyBasic());
		
		System.out.println("Annual Basic: " + firstEmployee.getAnnualBasic());
		System.out.println("Monthly Gross salary: " + firstEmployee.getMonthlyGrossSalary());
		System.out.println("Annual Gross salary: " + firstEmployee.getAnnualGrossSalary());
		System.out.println("Monthly deduction: " + firstEmployee.getMonthlyDeduction());
		System.out.println("Monthly take home: " + firstEmployee.getMonthlyTakeHome());
		System.out.println("Annual take home: " + firstEmployee.getAnnualTakeHome());
		

	}

}
