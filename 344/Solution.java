class Solution {
    public String reverseString(String s) {

        char[] temp = s.toCharArray();
        int i = 0;
        int j = temp.length - 1;

        while (true) {
            if (i == j || j < i) {
                break;
            }

            char mes = temp[i];
            temp[i] = temp[j];
            temp[j] = mes;

            i++;
            j--;
        }

        s = String.valueOf(temp);

        return s;
    }
}