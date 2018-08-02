class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if (map.get(C[i] + D[j]) == null) {
                    map.put(C[i] + D[j], 1);
                } else {
                    map.put(C[i] + D[j], map.get(C[i] + D[j]) + 1);
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (map.get(0 - A[i] - B[j]) != null) {
                    res += map.get(0 - A[i] - B[j]);
                }
            }
        }

        return res;
    }
}