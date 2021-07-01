package arrays;

public class KadaneAlgorithm {
    public static int largestSum(int[] arr) {
        int maxSumSoFar = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(0, sum + arr[i]);
            maxSumSoFar = Math.max(sum, maxSumSoFar);
        }
        return maxSumSoFar;
    }
}
