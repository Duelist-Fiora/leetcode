import java.util.Arrays;

/**
 * @author liangjh
 * @create 2018-08-02 14:05
 **/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int sup;
        int i;
        int j = 0;
        for (i = 0; i < numbers.length; i++) {
            sup = target - numbers[i];
            int left = i + 1, right = numbers.length;
            int mid = (left + right) / 2;
            while (left < right) {
                if (numbers[mid] == sup) {
                    j = mid;
                    break;
                } else if (numbers[mid] < sup) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (j != 0) {
                break;
            }
        }
        index[0] = ++i;
        index[1] = ++j;

        return index;
    }

}
