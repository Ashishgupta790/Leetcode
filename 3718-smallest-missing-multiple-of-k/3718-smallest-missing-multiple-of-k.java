class Solution {
    public int missingMultiple(int[] nums, int k) {

        int j = 1;

        while (true) {
            int mul = k * j;
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == mul) {
                    count++;
                }
            }

            if (count == 0) {
                return mul;
            }

            j++;
        }
    }
}