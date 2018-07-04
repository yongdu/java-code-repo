package yong.du.keep.learning;

public class GenericMaximumTest {

	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d %n%n", 3,4,5, maximum(3,4,5));
		
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f %n%n", 3.3,4.4,5.5, maximum(3.3,4.4,5.5));
		
		System.out.printf("Maximum of %s, %s and %s is %s %n%n", "apple","pear","banana", maximum("apple","pear","banana"));
		
	}
	
	// determine the largest of three comparable objects
	public static <T extends Comparable<T> > T maximum(T x, T y, T z) {
		T max = x;
		
		if(y.compareTo(max) >0) max =y;
		if(z.compareTo(max) >0) max =z;
		
		return max;
	}
}
