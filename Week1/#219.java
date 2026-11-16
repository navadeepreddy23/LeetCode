import java.util.HashMap;

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            if (map.containsKey(nums[i])) {
                // Check distance
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Case 1 Output: " + containsNearbyDuplicate(nums1, 3));

        
        int[] nums2 = {1, 0, 1, 1};
        System.out.println("Case 2 Output: " + containsNearbyDuplicate(nums2, 1));

        
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println("Case 3 Output: " + containsNearbyDuplicate(nums3, 2));
    }
}