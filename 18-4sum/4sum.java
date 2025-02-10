import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int first = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) // Skip duplicate first element
                continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) // Skip duplicate second element
                    continue;

                int second = nums[j];

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) first + second + nums[left] + nums[right]; // Prevent overflow
                    if (sum == target) {
                        ans.add(Arrays.asList(first, second, nums[left], nums[right]));

                        // Skip duplicate elements
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;

                        left++;
                        right--;
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return ans;
    }
}