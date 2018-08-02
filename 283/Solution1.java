/**
 * @author liangjh
 * @create 2018-08-02 14:01
 **/
public class Solution1 {
    public void moveZeros(int[] nums) {
        int[] nonZeroEle = new int[nums.length];
        int j = 0;
        //取出所有非0元素
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nonZeroEle[j] = nums[i];
                j++;
            }
        }
        //把所有的非0元素按顺序放在前面
        for (int i = 0; i < j; i++) {
            nums[i] = nonZeroEle[i];
        }
        //后面的都置为0
        for (; j < nonZeroEle.length; j++){
            nums[j] = 0;
        }
    }
}
