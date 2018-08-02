class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1 || k <= 0) {
            return false;
        }

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && map.get(nums[i]) > 0) {
                return true;
            } else {
                map.put(nums[i],1);
            }
            if (map.size() == k + 1) {
                map.remove(nums[i-k]);
            }

        }


        return false;
    }
}