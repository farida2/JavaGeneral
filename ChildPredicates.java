import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChildPredicates {
	static Predicate<Child> filterByAge(int x){
		
		return a -> a.getAge() > x; // lambda expression
	}
	
	static List<Child> filterChilds(List<Child> childs, Predicate<Child> predicate) {
		return childs.stream().filter(predicate).collect(Collectors.<Child> toList());
	}

}

class Child{
	int age;
	
	public Child(int age) {
	
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
