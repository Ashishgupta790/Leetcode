class Solution {
    public int mySqrt(int x) {
       if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use division (x / mid) instead of (mid * mid) to avoid integer overflow
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) { // Equivalent to mid * mid < x
                ans = mid;              // mid is a valid potential answer
                left = mid + 1;         // try searching higher
            } else {
                right = mid - 1;        // mid is too large, search lower
            }
        }

        return ans; // or return right;
    }
}