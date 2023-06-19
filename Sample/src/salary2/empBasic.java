package salary2;

import Salary4.EmpSalary;

public class empBasic extends EmpSalary{
	
	public void calculateBonus() {
		
	super.totalSalary(30000,2000,6000);
	int bonus= (30000*10)/100;
	
	System.out.println("Bonus : " +bonus);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empBasic obj1=new empBasic();
		obj1. calculateBonus();
		
}
}