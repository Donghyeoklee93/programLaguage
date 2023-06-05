package ch14_Lambda_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // list를 stream으로 변환
        intStream.forEach(System.out::print); // forEach() 최종연산

        // stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
        intStream = list.stream(); // list로부터 stream을 생성
        intStream.forEach(System.out::print);
        System.out.println();

        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        String[] strArr = {"a", "b", "c", "d"};
        strStream = Stream.of(strArr);
        strStream.forEach(System.out::println);

        strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream2 = Arrays.stream(intArr);
//        intStream2.forEach(System.out::println);
        System.out.println("count=" + intStream2.count()); //최종연산

        intStream2 = Arrays.stream(intArr);
        System.out.println("sum=" + intStream2.sum()); //최종연산

        intStream2 = Arrays.stream(intArr);
        System.out.println("average=" + intStream2.average()); //최종연산

        Integer[] intArr2 = {1, 2, 3, 4, 5, 6};
        Stream<Integer> intStream3 = Arrays.stream(intArr2);
//        intStream3.forEach(System.out::println);
        System.out.println("count=" + intStream3.count());
    }
}
