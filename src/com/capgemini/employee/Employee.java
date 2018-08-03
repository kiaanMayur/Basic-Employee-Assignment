package com.capgemini.employee;

/*class which contains the attributes of an employee & calculate its salary
HRA -> 50% of basic
medical allowance -> 1250
conveyance allowance -> 800
PF -> 10% of monthly  basic or 6500
ESIC -> 4.75% of monthly basic(if mb <= 5000)
professional tax -> 50(if monthly gross <= 10000) else 100
*/
public class Employee {
	
	private int id;
	private String name;
	private double monthlyBasic;
	
	public Employee() {
		monthlyBasic = 1000.0;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	public double getAnnualBasic() {
		
		return (12.0 * monthlyBasic);
	}
	
	public double getMonthlyGrossSalary() {
		
		double hra = monthlyBasic / 2;
		double medicalAllowance = 1250.0;
		double conveyanceAllowance = 800.0;
		
		return (monthlyBasic + hra + medicalAllowance + conveyanceAllowance);
		
	}
	
	public double getAnnualGrossSalary() {
		
		return ( 12.0 * getMonthlyGrossSalary());
	}
	
	public double getMonthlyDeduction() {
		
		double pf, esic = 0, professionalTax;
		if((0.1 * monthlyBasic) > 6500) {
			pf = 6500.0;
		}
		else
			pf = 0.1 * monthlyBasic;
		
		if(monthlyBasic <= 5000)
			 esic = 0.475 * monthlyBasic;
		
		if(getMonthlyGrossSalary() <= 10000)
			professionalTax = 50.0;
		else professionalTax = 100.0;
		
		return (pf + esic + professionalTax);
	}
	
	
	public double getMonthlyTakeHome() {
		
		return (getMonthlyGrossSalary() - getMonthlyDeduction() );
	}
	
	public double getAnnualTakeHome() {
		
		return (12 * getMonthlyTakeHome());
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", monthlyBasic=" + monthlyBasic + "]";
	}
	
}
