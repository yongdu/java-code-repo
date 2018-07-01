package yong.du.keep.learning;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAndStream {

	public static void main(String[] args) {
		
		Integer[] values = {1,2,5,4,9,14,29,41};
		String[] strings = {"Yellow", "orange", "green","indigo","Violet"};
		
		// Display original values
		System.out.printf("Original values: %s%n", Arrays.asList(values));
		
		// Sort values in ascending order with streams
		System.out.printf("Sorted values:   %s%n", 
				Arrays.stream(values)
					  .sorted()
					  .collect(Collectors.toList())
				);
		
		// Values greater than 5
		List<Integer> greaterThan5 = 
			Arrays.stream(values)
				  .filter(value -> value > 5)
				  .sorted()
				  .collect(Collectors.toList());
		System.out.printf("Values greater than 5: %s%n",greaterThan5 );
		
		
		// Display original strings
		System.out.printf("Original strings: %s%n", Arrays.asList(strings));
		
		// string in uppercase
		System.out.printf("Strings in uppercase:   %s%n", 
				Arrays.stream(strings)
					  .map(String::toUpperCase)
					  .collect(Collectors.toList())
				);
		// string greater than "m" (case insensitive) sorted ascending
		System.out.printf("string greater than \"m\" (case insensitive) sorted ascending:   %s%n", 
				Arrays.stream(strings)
					  .filter(s-> s.compareToIgnoreCase("m")>0)
					  .sorted(String.CASE_INSENSITIVE_ORDER)
					  .collect(Collectors.toList())
				);		
		
		// string greater than "m" (case insensitive) sorted descending
				System.out.printf("string greater than \"m\" (case insensitive) sorted descending:   %s%n", 
						Arrays.stream(strings)
							  .filter(s-> s.compareToIgnoreCase("m")>0)
							  .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
							  .collect(Collectors.toList())
						);		
				
	}
}
