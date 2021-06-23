package arrays.sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveNegativesToOneSideTests {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void moveNegatives() {
        var arr = new int[] {1, 2, 3, -1, -2, 4, -5};
        MoveNegativesToOneSide.moveNegatives(arr);
        assertTrue(Arrays.equals(new int[]{-5, -2, -1, 3, 2, 4, 1}, arr));
    }

    @Test
    void moveNegatives1() {
        var arr = new int[] {-2, 1, 2};
        MoveNegativesToOneSide.moveNegatives(arr);
        assertTrue(Arrays.equals(new int[]{-2, 1, 2}, arr));
    }
}