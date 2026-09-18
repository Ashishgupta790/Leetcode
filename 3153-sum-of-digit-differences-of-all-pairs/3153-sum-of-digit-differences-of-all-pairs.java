class Solution {
    public long sumDigitDifferences(int[] nums) {

        int n = nums.length;
        long ans = 0;

        while (nums[0] > 0) {

            int[] count = new int[10];

            // Count each digit at this position
            for (int num : nums) {
                int digit = num % 10;
                count[digit]++;
            }

            // Count different pairs
            for (int i = 0; i < 10; i++) {
                ans += (long) count[i] * (n - count[i]);
            }

            // Move to the next digit
            for (int i = 0; i < n; i++) {
                nums[i] /= 10;
            }
        }

        return ans / 2;
    }
}