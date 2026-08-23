class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int sum1 = 0;
        int sum2 = 0;
        int q1 = 0;
        int q2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                q1++;
            } else {
                sum1 += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                q2++;
            } else {
                sum2 += num.charAt(i) - '0';
            }
        }

        // Odd difference in '?' means Alice can always win
        if ((q1 - q2) % 2 != 0) {
            return true;
        }

        int sumDiff = sum1 - sum2;
        int qDiff = q2 - q1;

        // Bob can win only in this exact situation
        return sumDiff != 9 * qDiff / 2;
    }
}