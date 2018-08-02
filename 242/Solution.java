class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i),1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) != null && map.get(t.charAt(i)) > 0) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }


        return true;
    }
}