import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse_1() {
        String input = "abcd";
        String output = ReverseString.reverse(input);
        assertEquals("dcba", output);
    }

    @Test
    void reverse_2() {
        String input = "abcde";
        String output = ReverseString.reverse(input);
        assertEquals("edcba", output);
    }
}