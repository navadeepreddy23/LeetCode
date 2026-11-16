public class TwoSum11 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        
        int[] nums1 = {2, 7, 11, 15};
        int[] ans1 = twoSum(nums1, 9);
        System.out.println("Case 1 Output: [" + ans1[0] + ", " + ans1[1] + "]");

        
        int[] nums2 = {2, 3, 4};
        int[] ans2 = twoSum(nums2, 6);
        System.out.println("Case 2 Output: [" + ans2[0] + ", " + ans2[1] + "]");

        
        int[] nums3 = {-1, 0};
        int[] ans3 = twoSum(nums3, -1);
        System.out.println("Case 3 Output: [" + ans3[0] + ", " + ans3[1] + "]");
    }
}