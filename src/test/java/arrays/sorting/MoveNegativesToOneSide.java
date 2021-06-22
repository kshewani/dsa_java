package arrays.sorting;

public class MoveNegativesToOneSide {
    public static void moveNegatives(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if (arr[left] >= 0 && arr[right] >= 0) {
                right--;
            } else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else {
                left++;
                right--;
            }
        }
    }
}
