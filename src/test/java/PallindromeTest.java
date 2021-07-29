import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PallindromeTest {

    @Test
    void isPlaindrome_1() {
        String input = "abcddcba";
        assertTrue(Pallindrome.isPlaindrome(input));
    }

    @Test
    void isPlaindrome_2() {
        String input = "abcdecba";
        assertTrue(Pallindrome.isPlaindrome(input));
    }

    @Test
    void isPlaindrome_3() {
        String input = "abcdedcba";
        assertTrue(Pallindrome.isPlaindrome(input));
    }
}