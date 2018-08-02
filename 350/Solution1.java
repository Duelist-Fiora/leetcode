class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        Map<Integer,Integer> result = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map1.get(nums1[i]) == null) {
                map1.put(nums1[i],1);
            } else {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map2.get(nums2[i]) == null) {
                map2.put(nums2[i],1);
            } else {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            }
        }

        Iterator <Map.Entry<Integer,Integer>> iterator = map1.entrySet().iterator();
        int key;

        while (iterator.hasNext()) {
            key = iterator.next().getKey();
            if (map2.get(key) != null) {
                result.put(key,Math.min(map1.get(key),map2.get(key)));
            }
        }

        Iterator <Map.Entry<Integer,Integer>> iterator1 = result.entrySet().iterator();
        List<Integer> list = new ArrayList<>();
        int value;

        while (iterator1.hasNext()) {
            Map.Entry<Integer,Integer> next = iterator1.next();
            key = next.getKey();
            value = next.getValue();
            while (value > 0) {
                list.add(key);
                value--;
            }
        }

        int[] resultArray = new int[list.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = list.get(i);
        }

        return resultArray;
    }
}