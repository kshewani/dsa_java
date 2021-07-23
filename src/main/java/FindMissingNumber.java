import java.util.Arrays;

public class FindMissingNumber {
    public static int findMissingNumber(int[] numbers, int totalCount) {
        int sum = (totalCount * (totalCount + 1)) / 2;
        int actualSum = Arrays.stream(numbers).sum();
        return sum - actualSum;
    }
}
