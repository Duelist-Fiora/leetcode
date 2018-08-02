class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        int number = 0;

        if (n == 1) {
            return true;
        }

        while (true) {

            number = 0;
            if (!set.contains(n)) {
                set.add(n);
            } else {
                return false;
            }

            while (n > 0) {
                int yushu = n % 10;
                n = n / 10;
                number += yushu * yushu;
            }
            n = number;
            if (number == 1) {
                return true;
            }
        }
    }
}