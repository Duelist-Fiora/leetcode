/**
 * @author liangjh
 * @create 2018-08-02 14:02
 **/
public class Solution2 {
    public void moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (;j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
