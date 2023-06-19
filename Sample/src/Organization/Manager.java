package Organization;

public class Manager extends Member{
	String department;
	Manager(String name,int age, int phoneno, String address, int salary ){
		
	
		this.name= name;
		this.age=age;
		this.phoneno=phoneno;
		this.address= address;
		this.salary= salary;
		
		
	
	}
public static void main(String[]args) {
		
		Manager  mgr = new Manager("Simi",28,123456,"xy villa", 30000);
			mgr.printSalary();	
}
}