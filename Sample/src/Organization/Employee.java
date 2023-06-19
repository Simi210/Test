package Organization;

public class Employee extends Member {

	String specialisation;
	Employee(String name,int age, int phoneno, String address, int salary ){
		this.name= name;
		this.age=age;
		this.phoneno=phoneno;
		this.address= address;
		this.salary= salary;
		
		
	}
	
	public static void main(String[]args) {
		
		Employee emp = new Employee("Simi",28,123456,"xy villa", 30000);
			emp.printSalary();	
	}
}

