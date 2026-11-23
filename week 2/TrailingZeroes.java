public class TrailingZeroes {

    public int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count = count + n;
        }

        return count;
    }

    public static void main(String[] args) {
        TrailingZeroes sol = new TrailingZeroes();

        System.out.println(sol.trailingZeroes(3));
        System.out.println(sol.trailingZeroes(5));
        System.out.println(sol.trailingZeroes(0));
    }
}