package arrays.reverse;

public class ArrayReverseUsingRecursion implements IArrayReverse {
    @Override
    public int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return this.reverseArray(arr, 0, arr.length - 1);
    }

    private int[] reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }

        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
        return reverseArray(arr, start + 1, end - 1);
    }

    public String reverseString(String str) {
        char[] arr = str.toCharArray();
        if (str == null || arr.length == 0) {
            return str;
        }
        int length = arr.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        return new String(arr);
    }

}
