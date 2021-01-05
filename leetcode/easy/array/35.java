/**
 * https://leetcode.com/problems/search-insert-position/
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                result = i;
                break;
            }
        }

        if(nums[nums.length - 1] < target) {
            result = nums.length;
        }

        return result;
    }
}
