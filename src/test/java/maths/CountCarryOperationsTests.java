package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCarryOperationsTests {

    @Test
    void countCarry_65_and_55() {
        int carries = CountCarryOperations.countCarry(65,55);
        assertEquals(2, carries);
    }

    @Test
    void countCarry_123_and_456() {
        int carries = CountCarryOperations.countCarry(123, 456);
        assertEquals(0, carries);
    }

    @Test
    void countCarry_555_and_555() {
        int carries = CountCarryOperations.countCarry(555, 555);
        assertEquals(3, carries);
    }

    @Test
    void countCarry_900_and_11() {
        int carries = CountCarryOperations.countCarry(900, 11);
        assertEquals(0, carries);
    }

    @Test
    void countCarry_145_and_55() {
        int carries = CountCarryOperations.countCarry(145, 55);
        assertEquals(2, carries);
    }

    @Test
    void countCarry_0_and_0() {
        int carries = CountCarryOperations.countCarry(0, 0);
        assertEquals(0, carries);
    }

    @Test
    void countCarry_1_and_9999() {
        int carries = CountCarryOperations.countCarry(1, 99999);
        assertEquals(5, carries);
    }

    @Test
    void countCarry_999045_and_1055() {
        int carries = CountCarryOperations.countCarry(999045, 1055);
        assertEquals(5, carries);
    }

    @Test
    void countCarry_101_and_809() {
        int carries = CountCarryOperations.countCarry(101,809);
        assertEquals(2, carries);
    }

    @Test
    void countCarry_189_and_209() {
        int carries = CountCarryOperations.countCarry(189,205);
        assertEquals(1, carries);
    }
}