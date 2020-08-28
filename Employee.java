
public class Employee extends User{
	float salary;
	Employee(String firstName, float salary){
		super(firstName);             // reusing parent constructor
		this.salary = salary;
	}
	
	void display() {
		System.out.println( getFirstName() + " " + salary);
	}

}
