package Independency;
import java.util.Random;

public class IsbnGenerator implements NumberGenerator {
	
	//Business method
	
	public String generateNumber() {
		
		return "13-83456-" + Math.abs(new Random().nextInt());
	}

}
