package arrays.sorting;

public class Sort012 {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i: arr){
            switch (arr[i]) {
                case 0:
                    zeros++;
                    break;
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
            }
        }

        int i = 0;
        while (zeros > 0) {
            arr[i++] = 0;
            zeros--;
        }

        while (ones > 0) {
            arr[i++] = 1;
            ones--;
        }

        while (twos > 0) {
            arr[i++] = 2;
            twos--;
        }

        return arr;
    }
}
