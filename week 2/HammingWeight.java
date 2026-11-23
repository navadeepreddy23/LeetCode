public class HammingWeight {

    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count = count + (n & 1);
            n = n >>> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        HammingWeight sol = new HammingWeight();

        System.out.println(sol.hammingWeight(11));
        System.out.println(sol.hammingWeight(128));
        System.out.println(sol.hammingWeight(2147483645));
    }
}