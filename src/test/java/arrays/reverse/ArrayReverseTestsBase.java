package arrays.reverse;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class ArrayReverseTestsBase {
    protected IArrayReverse _classToTest;
    int[] _oddSizeArray;
    int[] _oddSizeArrayexpectedOutput;
    int[] _evenSizeArray;
    int[] _evenSizeArrayexpectedOutput;
    int[] _emptyArray;

    void setUp(IArrayReverse classToTest) {
        this._oddSizeArray = new int[]{5, 4, 3, 2, 1};
        this._oddSizeArrayexpectedOutput = new int[]{1, 2, 3, 4, 5};
        this._evenSizeArray = new int[]{4, 3, 2, 1};
        this._evenSizeArrayexpectedOutput = new int[]{1, 2, 3, 4};
        this._classToTest = classToTest;
        this._emptyArray = new int[0];
    }

    void tearDown() {
    }

    void reverseArray_when_array_size_is_null_should_return_an_empty_array() {
        var reversedArray = this._classToTest.reverseArray(null);
        Assertions.assertEquals(null, reversedArray);
    }

    void reverseArray_when_array_size_is_zero_should_return_an_empty_array() {
        var reversedArray = this._classToTest.reverseArray(this._emptyArray);
        Assertions.assertTrue(Arrays.equals(_emptyArray, reversedArray));
    }

    void reverseArray_when_array_size_is_odd_should_reverse_the_array() {
        var reversedArray = this._classToTest.reverseArray(_oddSizeArray);
        Assertions.assertTrue(Arrays.equals(_oddSizeArray, reversedArray));
    }

    void reverseArray_when_array_size_is_even_should_reverse_the_array() {
        var reversedArray = this._classToTest.reverseArray(_evenSizeArray);
        Assertions.assertTrue(Arrays.equals(this._evenSizeArrayexpectedOutput, reversedArray));
    }
}
