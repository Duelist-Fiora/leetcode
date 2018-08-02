class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set first = new HashSet();
        Set second = new HashSet();

        for (int i = 0; i < nums1.length; i++) {
            first.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (first.contains(nums2[i])) {
                second.add(nums2[i]);
            }
        }

        int i = 0;
        int[] result = new int[second.size()];
        Iterator iterator = second.iterator();

        while (iterator.hasNext()) {
            result[i] = (int)iterator.next();
            i++;
        }

        return result;
    }
}