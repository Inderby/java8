import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample {
    public static void main(String[] args) {
        /**
         * Imperative style
         */
        int sum=0;
        for(int i = 0; i <= 100; i++)
            sum += i;

        System.out.println(sum);
        /**
         * Declarative style
         */

        int sum1 = IntStream.rangeClosed(0, 100)
                .parallel() //쓰레드로 분리되어 병렬적으로 실
                .sum();
        System.out.println(sum1);
    }
}
