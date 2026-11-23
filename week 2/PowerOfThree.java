public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        return 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        PowerOfThree sol = new PowerOfThree();

        System.out.println(sol.isPowerOfThree(27));
        System.out.println(sol.isPowerOfThree(0));
        System.out.println(sol.isPowerOfThree(-1));
    }
}