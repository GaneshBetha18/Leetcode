class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTriplet = 0;
        int maxDiff = Integer.MIN_VALUE;
        
        for (int j = 1; j < nums.length - 1; j++) {
            for (int i = 0; i < j; i++) {
                maxDiff = Math.max(maxDiff, nums[i] - nums[j]);
            }
            for (int k = j + 1; k < nums.length; k++) {
                maxTriplet = Math.max(maxTriplet, (long) maxDiff * nums[k]);
            }
        }
        
        return maxTriplet;
    }
}