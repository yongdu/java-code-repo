package yong.du.keep.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReference {
    public static  void main(String ... args) {
        // lambda
        List<String> str = Arrays.asList("a", "b", "A","B");
        str.sort((s1, s2) -> s1.compareTo(s2));

        // method reference
        str.sort(String::compareToIgnoreCase);

        // lambda
        Function<String, Integer> stringToInteger = (s ->Integer.parseInt(s));
        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
        // method reference
        Function<String, Integer> stringToInteger2 = (Integer::parseInt);
        BiPredicate<List<String>, String> contains2 = List::contains;




    }

     public interface TriFunction<T,U,V,R> {
        R apply(T t, U u, V v);
     }
}
