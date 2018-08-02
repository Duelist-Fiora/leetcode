class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] nums = new int[128];
        char[] temp = s.toCharArray();
        int i = 0,j = -1;
        int res = 0;
        while (i < temp.length) {

            if (j + 1 < temp.length && nums[temp[j+1]] == 0) {
                j++;
                nums[temp[j]]++;
            } else {
                nums[temp[i]]--;
                i++;
            }

            res = Math.max(res,j - i + 1);

        }

        return res;
    }
}