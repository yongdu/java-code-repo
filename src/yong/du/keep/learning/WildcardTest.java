package yong.du.keep.learning;
import java.util.ArrayList;
public class WildcardTest {

	public static void main(String [] args) {
		Integer[] ints = {11,22,23,33};
		ArrayList<Integer> intsList= new ArrayList<>();
		
		for(Integer element:ints) {
			intsList.add(element);
		}
		
		System.out.printf("integer list contains:%s %n",intsList);
		System.out.printf("total of the elements in intList: %.0f%n",sum(intsList));
		
	}
	public static double sum(ArrayList<? extends Number> list) {
		double total =0.0;
		for (Number num : list)
			total += num.doubleValue();
		return total;
	
	}
}
