
class Solution {
    public int minOperations(String s) {

        char min = 'z';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a' && ch < min) {
                min = ch;
            }
        }

        if (min == 'z' && s.indexOf('z') == -1) {
            return 0;
        }

        return 'z' - min + 1;
    }
}