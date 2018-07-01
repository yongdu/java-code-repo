package yong.du.keep.learning;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
public class IntStreamOperations {
	public static void main(String[] args) {
		int[] values = {2,3,4,5,6,9,7,13,17,76,88};
		
		
		System.out.printf("The orginal values: %n");
		IntStream.of(values)
				 .forEach(value -> System.out.printf("%d ", value));
		
		System.out.println();
		
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());
		System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
		System.out.printf("Sum: %d%n", IntStream.of(values).sum());
		System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
		
		
		// sum by using reduce method
		System.out.printf("Sum: %d%n ", IntStream.of(values).reduce(0,(x,y)->x+y));
		
		// even value displayed in sorted order
		System.out.printf("%nEven values displayed in sorted order: ");
		IntStream.of(values)
				 .filter(value -> value%2 == 0)
				 .sorted()
				 .forEach(value -> System.out.printf("%d ", value));
		
		// odd vales multiplied by 10 and display in sorted order
		System.out.printf("%nOdd vales multiplied by 10 and display in sorted order: ");
		IntStream.of(values)
		 .filter(value -> value%2 == 0)
		 .map(value -> value * 10)
		 .sorted()
		 .forEach(value -> System.out.printf("%d ", value));
		
		IntPredicate even = value-> value %2 == 0;
		IntPredicate greaterThan5 = value ->value>5;
		
		// combine filter condition , even values that are greater than 5  multiplied by 10 displayed in sorted order
		System.out.printf("%nEven values that are greater than 5  multiplied by 10 displayed in sorted order: ");
		IntStream.of(values)
		 .filter(even.and(greaterThan5))
		 .map(value -> value * 10)
		 .sorted()
		 .forEach(value -> System.out.printf("%d ", value));
		
		System.out.println();
		// sum range of integer from 1 to 10, exclusive
		System.out.printf("Sum of integer form 1 to 9: %d%n", IntStream.range(1, 10).sum());
		
		// sum range of integer from 1 to 10, inclusive
				System.out.printf("Sum of integer form 1 to 10: %d%n", IntStream.rangeClosed(1, 10).sum());
	}	
}
