import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return IntStream.of(numbers).filter(x -> x % 2 == 0).map(d -> d*d).sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return IntStream.of(numbers).filter(x -> x % 2 != 0).sorted().toArray();
    }
}
