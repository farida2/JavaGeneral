import java.io.IOException;
public class ShowingThrows {
	void myFirstMethod() throws IOException{
		throw new IOException("Device Error"); // check the exception

	}
	
	void mySecondMethod() throws IOException{
		myFirstMethod();
	}
	
	void myThirdMethod() {
		try {
			mySecondMethod();
		}
		catch(Exception exp) {
			System.out.println("Exception corrected!");
		}
	}
	
	

}
