import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        
        int count1 = 0, count2 = 0;
        int cand1 = 0, cand2 = 0;

        
        for (int num : nums) {
            if (num == cand1) {
                count1++;
            } else if (num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) ans.add(cand1);
        if (count2 > n / 3) ans.add(cand2);

        return ans;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {3, 2, 3};
        System.out.println("Case 1 Output: " + majorityElement(nums1));

        
        int[] nums2 = {1};
        System.out.println("Case 2 Output: " + majorityElement(nums2));

        
        int[] nums3 = {1, 2};
        System.out.println("Case 3 Output: " + majorityElement(nums3));
    }
}