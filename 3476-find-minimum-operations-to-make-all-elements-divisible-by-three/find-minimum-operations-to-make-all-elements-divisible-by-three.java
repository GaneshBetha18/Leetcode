class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int p : nums){
            if(p % 3 == 1 || p % 3 == 2){
                count += 1;
            }
        }
        return count;
    }
}