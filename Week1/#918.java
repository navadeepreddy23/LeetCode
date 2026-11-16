public class MaxCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = nums[0];
        int currMax = 0;
        int minSum = nums[0];
        int currMin = 0;

        for (int num : nums) {
            
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);

            
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);

            total += num;
        }

        
    
        if (total == minSum) {
            return maxSum;
        }

        
        return Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {
        
        int[] nums1 = {1, -2, 3, -2};
        System.out.println("Case 1 Output: " + maxSubarraySumCircular(nums1));

        
        int[] nums2 = {5, -3, 5};
        System.out.println("Case 2 Output: " + maxSubarraySumCircular(nums2));

        
        int[] nums3 = {-3, -2, -3};
        System.out.println("Case 3 Output: " + maxSubarraySumCircular(nums3));
    }
}