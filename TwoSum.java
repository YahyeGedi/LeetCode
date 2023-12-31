import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] Solution = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hash.containsKey(diff)) {
                Solution[0] = hash.get(diff);
                Solution[1] = i;
                return Solution;
            }
            hash.put(nums[i], i);
        }
        Solution[0] = 0;
        Solution[1] = 0;
        return Solution;
    }
}