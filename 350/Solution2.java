class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map1.get(nums1[i]) == null) {
                map1.put(nums1[i],1);
            } else {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map1.containsKey(nums2[i]) && map1.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map1.put(nums2[i], map1.get(nums2[i]) - 1);
            }
        }

        int[] resultArray = new int[list.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = list.get(i);
        }

        return resultArray;
    }
}