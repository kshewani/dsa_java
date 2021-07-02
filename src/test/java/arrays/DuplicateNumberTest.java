package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findDuplicate_1() {
        int dup = DuplicateNumber.findDuplicate(new int[]{2,3,4,2,2});
        assertEquals(2, dup);
    }

    @Test
    void findDuplicate_2() {
        int dup = DuplicateNumber.findDuplicate(new int[]{3,1,3,4,2});
        assertEquals(3, dup);
    }

    @Test
    void findDuplicate_3() {
        int dup = DuplicateNumber.findDuplicate(new int[]{1,1});
        assertEquals(1, dup);
    }

    @Test
    void findDuplicate_4() {
        int dup = DuplicateNumber.findDuplicate(new int[]{1,1, 2});
        assertEquals(1, dup);
    }

    @Test
    void findDuplicate_5() {
        int dup = DuplicateNumber.findDuplicate(new int[0]);
        assertEquals(0, dup);
    }

    @Test
    void findDuplicate_WhenANumberIsRepeatedOnlyOnce() {
        int dup = DuplicateNumber.findDuplicateWhenANumberIsRepeatedOnlyOnce(new int[]{1,3,4,2,2});
        assertEquals(2, dup);
    }
}