import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        if (x == 0 || x == 1) {
            System.out.println(x);
            return;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            
            long square = (long) mid * mid;

            if (square == x) {
                ans = mid;
                break;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}