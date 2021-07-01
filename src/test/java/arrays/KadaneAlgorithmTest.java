package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KadaneAlgorithmTest {

    @Test
    void largestSum_1() {
        int result = KadaneAlgorithm.largestSum(new int[] {1, 2, 3, -2, 5});
        assertEquals(9, result);
    }

    @Test
    void largestSum_2() {
        int result = KadaneAlgorithm.largestSum(new int[] {-1, -2, -3, -4});
        assertEquals(0, result);
    }

    @Test
    void largestSum_3() {
        int result = KadaneAlgorithm.largestSum(new int[] {74, -72, 94, -53, -59, -3, -66, 36, -13, 22, 73, 15, -52, 75});
        assertEquals(156, result);
    }

    @Test
    void largestSum_4() {
        int result = KadaneAlgorithm.largestSum(new int[] {-2, -3, 4, -1, -2, 1, 5, -3});
        assertEquals(7, result);
    }
}