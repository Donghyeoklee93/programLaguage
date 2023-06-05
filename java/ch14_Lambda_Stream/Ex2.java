package ch14_Lambda_Stream;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex2 {
    public static void main(String[] args) {

//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//        Function<String, Integer> f = Integer::parseInt;
//        System.out.println(f.apply("100"));

        //Supplier는 입력 X, 출력 O
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;

        Function<Integer, MyClass> f = (i) -> new MyClass(i);
//        Function<Integer, MyClass> f = MyClass::new;

        MyClass mc = f.apply(100);
        System.out.println(mc.iv);

        System.out.println(f.apply(200).iv);


//        Function<Integer, int[]> f2 = (i) -> new int[i];
        Function<Integer, int[]> f2 = int[]::new;
        int[] arr = f2.apply(100);
        System.out.println("arr.length=" + arr.length);

    }
}

class MyClass {
    int iv;

    MyClass(int iv) {
        this.iv = iv;
    }
}

