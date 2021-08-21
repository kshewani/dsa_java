import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthFibonnaciTest {

    @Test
    void nthFibonnaci() {
        assertEquals(0, NthFibonnaci.nthFibonnaci(0));
        assertEquals(0, NthFibonnaci.nthFibonnaci(1));
        assertEquals(1, NthFibonnaci.nthFibonnaci(2));
        assertEquals(2, NthFibonnaci.nthFibonnaci(3));
        assertEquals(3, NthFibonnaci.nthFibonnaci(4));
        assertEquals(5, NthFibonnaci.nthFibonnaci(5));
        assertEquals(8, NthFibonnaci.nthFibonnaci(6));
        assertEquals(13, NthFibonnaci.nthFibonnaci(7));
        assertEquals(21, NthFibonnaci.nthFibonnaci(8));
        assertEquals(34, NthFibonnaci.nthFibonnaci(9));
        assertEquals(55, NthFibonnaci.nthFibonnaci(10));
        assertEquals(823693831, NthFibonnaci.nthFibonnaci(656));
    }
}