package arrays.reverse;

public class ArrayReverseUsingSwapFromEdges implements IArrayReverse {
    @Override
    public int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int length = arr.length;

        for (int i = 0; i < length / 2; i++) {
            arr[i] = arr[i] + arr[length - i - 1];
            arr[length - i - 1] = arr[i] - arr[length - i - 1];
            arr[i] = arr[i] - arr[length - i - 1];
        }
        return arr;
    }
}

