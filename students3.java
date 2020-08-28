

public class students3 {
	int rollNm ;
	String name;
	static String college = "MIT";
	static void change() {
		college = "Harvard";
	}
	
	students3(int r, String n){
		rollNm = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollNm + " "+ name +" " + college );
	}
	

}
