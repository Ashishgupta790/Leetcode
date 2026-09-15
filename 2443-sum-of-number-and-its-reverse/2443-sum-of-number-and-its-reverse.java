class Solution {
    public boolean sumOfNumberAndReverse(int num) {

        for (int i = 0; i <= num; i++) {

            int reverse = 0;
            int n = i;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            if (i + reverse == num) {
                return true;
            }
        }

        return false;
    }
}