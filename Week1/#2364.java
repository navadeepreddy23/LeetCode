import java.util.HashMap;

public class BadPairs {
    public static long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = n * (n - 1) / 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            
            int key = nums[i] - i;

            if (map.containsKey(key)) {
                goodPairs += map.get(key);
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return totalPairs - goodPairs;
    }

    public static void main(String[] args) {
    
        int[] nums1 = {4, 1, 3, 3};
        System.out.println("Case 1 Output: " + countBadPairs(nums1));

        
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("Case 2 Output: " + countBadPairs(nums2));
    }
}