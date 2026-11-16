public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println("Case 1 Output: " + numIdenticalPairs(nums1));

        
        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Case 2 Output: " + numIdenticalPairs(nums2));

        
        int[] nums3 = {1, 2, 3};
        System.out.println("Case 3 Output: " + numIdenticalPairs(nums3));
    }
}