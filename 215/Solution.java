/**
 * @author liangjh
 * @create 2018-08-02 14:05
 **/
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[nums1.length];
        int i = 0,j = 0,k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
                k++;
            } else {
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }

        if (i == m && j < n) {
            while (j < n) {
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }

        if (j == n && i < m) {
            while (i < m) {
                temp[k] = nums1[i];
                i++;
                k++;
            }
        }

        for (int h = 0;h < nums1.length;h++) {
            nums1[h] = temp[h];
        }

    }
}
