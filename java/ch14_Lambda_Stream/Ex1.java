package ch14_Lambda_Stream;

public class Ex1 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b; // 람다식. 익명객체

//        MyFunction f = new MyFunction() {
//            public int max(int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못 바꾼다.
//                return a > b ? a : b;
//            }
//        };

        //람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction1 f = (a, b) -> a > b ? a : b; // 람다식. 익명객체

        int value = f.max(3, 5); // 함수형 인터페이스
        System.out.println("value = " + value);
    }
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상메서드만 가져야 함.
interface MyFunction1 {
    public abstract int max(int a, int b);
}
