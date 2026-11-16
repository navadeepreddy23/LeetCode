import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // Mark visited numbers
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        List<Integer> ans = new ArrayList<>();
        // Numbers which are still positive = missing
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Case 1 Output: " + findDisappearedNumbers(nums1));

        
        int[] nums2 = {1, 1};
        System.out.println("Case 2 Output: " + findDisappearedNumbers(nums2));
    }
}