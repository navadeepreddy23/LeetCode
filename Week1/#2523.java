public class ClosestPrimes {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int[] closestPrimes(int left, int right) {
        int prev = -1;
        int minGap = Integer.MAX_VALUE;
        int[] ans = {-1, -1};

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (prev != -1) {
                    int gap = i - prev;
                    if (gap < minGap) {
                        minGap = gap;
                        ans[0] = prev;
                        ans[1] = i;
                    }
                }
                prev = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Case 1
        int[] ans1 = closestPrimes(10, 19);
        System.out.println("Case 1 Output: [" + ans1[0] + ", " + ans1[1] + "]");

        // Case 2
        int[] ans2 = closestPrimes(4, 6);
        System.out.println("Case 2 Output: [" + ans2[0] + ", " + ans2[1] + "]");
    }
}