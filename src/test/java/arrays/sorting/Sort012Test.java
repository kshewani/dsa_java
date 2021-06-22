package arrays.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Sort012Test {

    @Test
    void sort_null_array_should_return_null() {
        var sortedArr = Sort012.sort(null);
        assertNull(sortedArr);
    }

    @Test
    void sort_zero_length_array_should_return_array_as_it_is() {
        int[] arr = new int[0];
        var sortedArr = Sort012.sort(arr);
        assertTrue(Arrays.equals(new int[0], sortedArr));
    }

    @Test
    void sort_array_should_return_sorted_arry() {
        int[] arr = {0, 1, 2, 2, 0};
        var sortedArr = Sort012.sort(arr);
        assertTrue(Arrays.equals(arr, sortedArr));
    }
}