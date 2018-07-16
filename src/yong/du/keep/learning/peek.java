package yong.du.keep.learning;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class peek {

    public static void main(String[] args) {
    // how to debug lambda
        List<Integer> result = Stream.of(12, 13, 56, 77)
                .peek(x -> System.out.println("taking from stream: " + x)).map(x -> x + 17)
                .peek(x -> System.out.println("after map: " + x)).filter(x -> x % 2 == 0)
                .peek(x -> System.out.println("after filter: " + x)).limit(3)
                .peek(x -> System.out.println("after limit: " + x)).collect(toList());
    }
}