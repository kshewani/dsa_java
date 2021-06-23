package arrays;

import java.util.*;

public class UnionAndIntersection {
    public static int[] union(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }

        if (arr2 == null || arr2.length == 0) {
            return arr1;
        }

        Set<Integer> union = new HashSet<>();
        for (int n : arr1) {
            union.add(n);
        }

        for (int n: arr2) {
            union.add(n);
        }

        return union.stream().mapToInt(n -> n).toArray();
    }

    public static int[] intersect(int[] arr1, int[] arr2) {
        if ((arr1 == null || arr1.length == 0) || (arr2 == null || arr2.length == 0)) {
            return new int[0];
        }
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;

        if (lenArr1 < lenArr2) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
        }

        Arrays.sort(arr2);

        List<Integer> intersection = new ArrayList<>();

        for (int n: arr1) {
            if (Arrays.binarySearch(arr2, n) >= 0) {
                intersection.add(n);
            }
        }

        return intersection.stream().mapToInt(n -> n).toArray();

    }
}
