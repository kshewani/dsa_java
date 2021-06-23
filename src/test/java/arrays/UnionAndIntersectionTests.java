package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionTests {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void union_when_second_array_is_null_should_return_first_array_as_union() {
        int[] arr1 = new int[] {1, 3};
        int[] arr2 = null;
        int[] union = UnionAndIntersection.union(arr1, arr2);
        assertTrue(Arrays.equals(arr1, union));
    }

    @Test
    void union_when_second_array_is_empty_should_return_first_array_as_union() {
        int[] arr1 = new int[] {1, 3};
        int[] arr2 = new int[0];
        int[] union = UnionAndIntersection.union(arr1, arr2);
        assertTrue(Arrays.equals(arr1, union));
    }

    @Test
    void union_when_first_array_is_empty_should_return_second_array_as_union() {
        int[] arr1 = new int[0];
        int[] arr2 = new int[] {1, 3};
        int[] union = UnionAndIntersection.union(arr1, arr2);
        assertTrue(Arrays.equals(arr2, union));
    }

    @Test
    void union_when_first_array_is_null_should_return_second_array_as_union() {
        int[] arr1 = null;
        int[] arr2 = new int[] {1, 3};
        int[] union = UnionAndIntersection.union(arr1, arr2);
        assertTrue(Arrays.equals(arr2, union));
    }

    @Test
    void union_when_both_arrays_have_values_should_return_the_union_of_two_arrays() {
        int[] arr1 = new int[] {1, 4, 2};
        int[] arr2 = new int[] {1, 3};
        int[] union = UnionAndIntersection.union(arr1, arr2);
        assertTrue(Arrays.equals(new int[] {1, 2, 3, 4}, union));
    }

    @Test
    void intersect_when_one_of_the_arrays_is_empty_should_return_nothing() {
        int[] arr1 = new int[0];
        int[] arr2 = new int[] {1, 3};
        int[] intersection = UnionAndIntersection.intersect(arr1, arr2);
        assertTrue(Arrays.equals(new int[0], intersection));
    }

    @Test
    void intersect_when_one_of_the_arrays_is_null_should_return_nothing() {
        int[] arr1 = null;
        int[] arr2 = new int[] {1, 3};
        int[] intersection = UnionAndIntersection.intersect(arr1, arr2);
        assertTrue(Arrays.equals(new int[0], intersection));
    }

    @Test
    void intersect_when_both_arrays_have_values_should_return_intersecting_values() {
        int[] arr1 = new int[] {1, 3};
        int[] arr2 = new int[] {1, 4, 2, 3};
        int[] intersection = UnionAndIntersection.intersect(arr1, arr2);
        assertTrue(Arrays.equals(new int[] {1, 3}, intersection));
    }
}