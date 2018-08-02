class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < numbers.length) {
            if (numbers[i] + numbers[j] == target) {
                break;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        index[0] = ++i;
        index[1] = ++j;

        return index;
    }
}