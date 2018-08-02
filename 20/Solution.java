class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                char macth;
                if (s.charAt(i) == ')') {
                    macth = '(';
                } else if (s.charAt(i) == ']') {
                    macth = '[';
                } else {
                    macth = '{';
                }

                if (top != macth) {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        }

        return false;
    }
}