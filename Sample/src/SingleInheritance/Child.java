package SingleInheritance;

public class Child extends Parent {
	void display1() {
		System.out.println("This is child class");
	}
	
	public static void main(String args[]){ 
		
		Child obj= new Child();
		obj.display();
		
	}
	}