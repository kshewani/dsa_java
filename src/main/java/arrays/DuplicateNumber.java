package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int duplicateNum = 0;
        for (int n: nums) {
            if (numSet.contains(n)) {
                duplicateNum = n;
                break;
            }

            numSet.add(n);
        }

        return duplicateNum;
    }

    public static int findDuplicateWhenANumberIsRepeatedOnlyOnce(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 2){
            return nums[0];
        }

        int actualSum = Arrays.stream(nums).sum();
        int n = nums.length - 1;
        // calculate expected  sum: n/2(first_number + last_number)
        int expectedSum = n / 2 * (1 + n);
        // actual sum - expected sum will return the duplicate number
        return actualSum - expectedSum;
    }
}
