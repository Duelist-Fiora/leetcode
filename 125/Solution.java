class Solution {
    public boolean isPalindrome(String s) {

        if ("".equals(s)) {
            return true;
        }
        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        boolean result = true;

        while (true) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (i == j || j < i) {
                break;
            }

            if (left < 48 || 57 < left && left < 65 || 91 < left && left < 97 || left > 122) {
                i++;
                continue;
            }
            if (right < 48 || 57 < right && right < 65 || 91 < right && right < 97 || right > 122) {
                j--;
                continue;
            }

            if (left == right) {
                i++;
                j--;
            } else {
                result = false;
                break;
            }

        }

        return result;
    }
}