/**
 * @author liangjh
 * @create 2018-08-02 14:04
 **/
public class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                //当出现了新的元素与修改后的数组的最后一个元素不相等，
                //必然需要接收一个新元素,
                //所以j需要++
                j++;
                //然后如果i大于经过+1处理后的j，
                //则i、j之间必然存在重复元素,
                //则将重复元素的第二个修改为新的元素
                if (i - j > 0) {
                    nums[j] = nums[i];
                }
            }
        }
        return j+1;
    }
}
