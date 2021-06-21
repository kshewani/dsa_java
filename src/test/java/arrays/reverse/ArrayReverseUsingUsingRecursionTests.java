package arrays.reverse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayReverseUsingRecursionTests extends ArrayReverseTestsBase {
    @BeforeEach
    void setUp() {
        super.setUp(new ArrayReverseUsingRecursion());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void reverseArray_when_array_size_is_null_should_return_an_empty_array() {
        super.reverseArray_when_array_size_is_null_should_return_an_empty_array();
    }

    @Test
    void reverseArray_when_array_size_is_zero_should_return_an_empty_array() {
        super.reverseArray_when_array_size_is_zero_should_return_an_empty_array();
    }

    @Test
    void reverseArray_when_array_size_is_odd_should_reverse_the_array() {
        super.reverseArray_when_array_size_is_odd_should_reverse_the_array();
    }

    @Test
    void reverseArray_when_array_size_is_even_should_reverse_the_array() {
        super.reverseArray_when_array_size_is_even_should_reverse_the_array();
    }
}