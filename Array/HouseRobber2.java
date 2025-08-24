//leetcode 213
public class HouseRobber2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; // Only one house

        // Case 1: rob houses 0 → n-2
        int case1 = robLinear(nums, 0, n - 2);

        // Case 2: rob houses 1 → n-1
        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int robLinear(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0, result = 0;

        for (int i = start; i <= end; i++) {
            result = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = result;
        }

        return result;
    }
}


