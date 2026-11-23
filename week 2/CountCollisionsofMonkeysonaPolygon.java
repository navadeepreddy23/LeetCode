class CountCollisionsofMonkeysonaPolygon {
    public int monkeyMove(int n) {
        long MOD = 1000000007L;
        long ans = modPow(2, n, MOD);
        ans = (ans - 2 + MOD) % MOD;
        return (int) ans;
    }

    private long modPow(long base, long exp, long mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}