public class Power {

    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double answer = 1;

        while (power > 0) {
            if (power % 2 == 1) {
                answer = answer * x;
            }
            x = x * x;
            power = power / 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Power sol = new Power();

        System.out.println(sol.myPow(2.0, 10));
        System.out.println(sol.myPow(2.1, 3));
        System.out.println(sol.myPow(2.0, -2));
    }
}