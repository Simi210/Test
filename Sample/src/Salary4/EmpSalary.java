package Salary4;

import salary2.TotalSalary;

public class EmpSalary {
	int basic,da,hr;
	public void totalSalary(int ba,int ded,int hra) {
		this.basic=ba;
		this.da=ded;
		this.hr=hra;
		int total= ba+da+hr;
		System.out.println("TOTAL SALARY : " +total);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpSalary obj=new EmpSalary();
		obj.totalSalary(30000,2000,6000);
	}
	}
