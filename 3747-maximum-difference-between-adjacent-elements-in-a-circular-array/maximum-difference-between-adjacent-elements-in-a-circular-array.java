class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len = nums.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, Math.abs(nums[i] - nums[(i + 1) % len]));
        }
        return max;
    }
}