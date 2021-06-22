package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findMinMax_when_array_is_null_should_return_minimum_and_maximum_values_in_the_given_array() {
        var minMax = MinMax.findMinMax(null);
        assertEquals(0, minMax[0]);
        assertEquals(0, minMax[1]);
    }

    @Test
    void findMinMax_when_array_has_no_values_should_return_minimum_and_maximum_values_in_the_given_array() {
        var minMax = MinMax.findMinMax(new int[0]);
        assertEquals(0, minMax[0]);
        assertEquals(0, minMax[1]);
    }

    @Test
    void findMinMax_when_array_has_only_one_value_should_return_minimum_and_maximum_values_in_the_given_array() {
        var minMax = MinMax.findMinMax(new int[] {5});
        assertEquals(5, minMax[0]);
        assertEquals(5, minMax[1]);
    }

    @Test
    void findMinMax_when_array_has_values_should_return_minimum_and_maximum_values_in_the_given_array() {
        var minMax = MinMax.findMinMax(new int[] {3, 32, 4, 54, 6, 5, 1});
        assertEquals(1, minMax[0]);
        assertEquals(54, minMax[1]);
    }
}