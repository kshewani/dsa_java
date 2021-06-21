package maths;

public class CountCarryOperations {
    public static int countCarry(int a, int b) {
        int carry_count = 0;
        int prev_carry = 0;
        while (a > 0 || b > 0) {
            int sum = prev_carry + (a%10) + (b%10);
            if (sum >= 10) {
                carry_count++;
                prev_carry = sum/10;
            }
            a /= 10;
            b /= 10;
        }
        return carry_count;
    }
}
