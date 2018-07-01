package Independency;
import java.util.Random;
public class IssnGenerator implements NumberGenerator {

	public String generateNumber() {
		return "8-" + Math.abs(new Random().nextInt());
	}
}
