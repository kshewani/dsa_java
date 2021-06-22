package arrays;

public class MinMax {
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[] {0, 0};
        }
        if (arr.length == 1) {
            return new int[] {arr[0], arr[0]};
        }

        int min = arr[0];
        int max = arr[1];
        for(int n: arr) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return new int[]{min, max};
    }
}
