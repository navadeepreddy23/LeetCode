import java.util.Arrays;

public class CountingBits {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        CountingBits sol = new CountingBits();

        System.out.println(Arrays.toString(sol.countBits(2)));
        System.out.println(Arrays.toString(sol.countBits(5)));
    }
}