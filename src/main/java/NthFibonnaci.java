public class NthFibonnaci {
    public static double nthFibonnaci(long n) {
        if (n <= 1) {
            return 0;
        }

        double fn = 0;
        double sn = 1;
        double nthFib = fn + sn;
        for (int i=1; i<=n-1; i++) {
            nthFib = fn + sn;
            fn = sn;
            sn = nthFib;
        }

        return nthFib;
    }
}
