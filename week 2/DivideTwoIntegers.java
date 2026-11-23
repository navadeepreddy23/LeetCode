class DivideTwoIntegers{
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

       
        boolean negative = (dividend < 0) ^ (divisor < 0);

        
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                quotient += (1L << i);
                a -= (b << i);
            }
        }

        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }
}