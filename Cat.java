
public class Cat extends Animal {
	String color = "White";
	
	void printColor() {
		System.out.println(color); // prints color of Cat class
		System.out.println(super.color); // prints color of Animal class
		
	}

}
