class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        int[] result1 = sol.buildArray(nums1);
        System.out.println(java.util.Arrays.toString(result1));

        int[] nums2 = {5, 0, 1, 2, 3, 4};
        int[] result2 = sol.buildArray(nums2);
        System.out.println(java.util.Arrays.toString(result2));
    }
}
