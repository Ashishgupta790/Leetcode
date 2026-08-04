class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        int left = 0;
        int right = num ;
        int ans = 0;

        while (left <= right) {
            int mid =( left + right)/ 2;

            // Use division (x / mid) instead of (mid * mid) to avoid integer overflow
            if ((long) mid*mid == num ) {
                return true;
            } else if ((long)mid*mid < num ) { // Equivalent to mid * mid < x
                             // mid is a valid potential answer
                left = mid + 1;   
                      // try searching higher
            } else {
                right = mid - 1;        // mid is too large, search lower
            }
        }

        return false;
    }
}