class SuperPow {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        a %= MOD;
        return dfs(a, b, b.length);
    }

    
    private int dfs(int a, int[] b, int idx) {
        if (idx == 0) {
            return 1;
        }
        int lastDigit = b[idx - 1];
        int prev = dfs(a, b, idx - 1);

        
        return (modPow(prev, 10) * modPow(a, lastDigit)) % MOD;
    }

    private int modPow(int base, int exp) {
        int res = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
}