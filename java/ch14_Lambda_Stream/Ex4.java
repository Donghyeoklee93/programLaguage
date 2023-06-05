package ch14_Lambda_Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
//        IntStream intStream = new Random().ints(); // 무한스트림
        IntStream intStream = new Random().ints(10, 5, 10);
        intStream
//                .limit(10) // 5개만 자르기
                .forEach(System.out::println);

        // iterate(T seed, UnaryOperator f) 단항 연산자
        Stream<Integer> intStream2 = Stream.iterate(1, n -> n + 2);
        intStream2.limit(10).forEach(System.out::println);

        // generate(Supplier s) : 주기만 하는 것 입력 x, 출력 O
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::println);

    }
}
