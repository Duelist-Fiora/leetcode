/**
 * @author liangjh
 * @create 2018-08-02 14:05
 **/
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
