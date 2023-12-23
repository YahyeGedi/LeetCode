import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> arr = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (arr.contains(nums[i])) {
                return true;
            } else {
                arr.add(nums[i]);
            }
        }

        return false;
    }
}