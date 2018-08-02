class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        if (nums == null || nums.length <= 1 || k <= 0) {
            return false;
        }
        long t1 = t;

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.ceiling(nums[i] - t1) != null  && set.ceiling(nums[i] - t1) <= nums[i] + t1) {
                return true;
            } else {
                set.add((long)nums[i]);
            }
            if (set.size() == k + 1) {
                set.remove((long)nums[i-k]);
            }
        }

        return false;
    }
}