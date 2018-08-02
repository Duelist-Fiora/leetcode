class Solution {
    public String reverseVowels(String s) {
        char[] temp = s.toCharArray();
        int i = 0;
        int j = temp.length - 1;

        while (true) {
            if (i == j || j < i) {
                break;
            }

            if (temp[i] != 'a' && temp[i] != 'e' && temp[i] != 'i' && temp[i] != 'o' && temp[i] != 'u'
                    && temp[i] != 'A' && temp[i] != 'E' && temp[i] != 'I' && temp[i] != 'O' && temp[i] != 'U') {
                i++;
                continue;
            }
            if (temp[j] != 'a' && temp[j] != 'e' && temp[j] != 'i' && temp[j] != 'o' && temp[j] != 'u'
                    && temp[j] != 'A' && temp[j] != 'E' && temp[j] != 'I' && temp[j] != 'O' && temp[j] != 'U') {
                j--;
                continue;
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