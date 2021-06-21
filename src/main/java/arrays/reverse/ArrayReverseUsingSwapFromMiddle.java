package arrays.reverse;

public class ArrayReverseUsingSwapFromMiddle implements IArrayReverse {
    @Override
    public int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int length = arr.length;
        /*
                    [0 1 2 3 4 5]     [0 1 2 3 4]     [0 1 2 3]     [0 1 2]
        length  =  	 6				   5 			   4             3
        mid     =    3				   2 			   2             1
        start   =    2				   1 			   1             0
        end     =    3				   3 			   2             2
        */
        int mid = length / 2;
        int start = mid - 1;
        int end = length % 2 == 0 ? mid : mid + 1;
        while (start >= 0) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start--;
            end++;
        }
        return arr;
    }
}

