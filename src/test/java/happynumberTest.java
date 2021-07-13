import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class happynumberTest {

    @Test
    void isHappy_1() {
        boolean result = happynumber.isHappy(19);
        assertTrue(result);
    }

    @Test
    void isHappy_2() {
        boolean result = happynumber.isHappy(20);
        assertFalse(result);
    }

    @Test
    void isHappy_3() {
        boolean result = happynumber.isHappy(1);
        assertTrue(result);
    }

    @Test
    void isHappy_4() {
        boolean result = happynumber.isHappy(192);
        assertTrue(result);
    }

    @Test
    void isHappy_7() {
        boolean result = happynumber.isHappy(7);
        assertTrue(result);
    }
}