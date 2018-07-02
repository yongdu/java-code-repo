package yong.du.keep.learning;

public class GenericMethodTest {

	public static void main(String [] args) {
		
		// create arrays of Integer,Double and Character
		Integer [] IntArray  = {1,2,3,4,6};
		Double [] DoubleArray = {1.1,2.2,3.3,4.4};
		Character[] characterArray = {'H','I','B','O'};
		System.out.printf("IntArray contains :%n");
		printArray(IntArray); // pass in as Interger array
		System.out.printf("%DoubleArray contains :%n");
		printArray(DoubleArray); // pass in as Double array
		System.out.printf("%characterArray contains :%n");
		printArray(characterArray); // pass in as character array
		
	}
	// generic method printArray
	public static  <T> void printArray(T[] inputArray)
	{
		// display array element
		for (T element:inputArray)
			System.out.printf("%s",element.toString());
		System.out.println();
	}
}
