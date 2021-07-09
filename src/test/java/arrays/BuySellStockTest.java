package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStockTest {

    @Test
    void maxProfit_1() {
        int[] prices = new int[] {7,1,5,3,6,4};
        int profit = BuySellStock.maxProfit(prices);
        assertEquals(5, profit);
    }

    @Test
    void maxProfit_2() {
        int[] prices = new int[] {7,2,5,3,6,4,1};
        int profit = BuySellStock.maxProfit(prices);
        assertEquals(4, profit);
    }

    @Test
    void maxProfit_3() {
        int[] prices = new int[] {7,6,4,3,1};
        int profit = BuySellStock.maxProfit(prices);
        assertEquals(0, profit);
    }

    @Test
    void maxProfit_4() {
        int[] prices = new int[0] ;
        int profit = BuySellStock.maxProfit(prices);
        assertEquals(0, profit);
    }
}