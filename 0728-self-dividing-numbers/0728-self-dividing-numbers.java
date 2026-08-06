import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isSelfDividing = true;

            while (num > 0) {
                int digit = num % 10;

                // If digit is 0 or doesn't divide the original number
                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false;
                    break;
                }

                num /= 10;
            }

            if (isSelfDividing) {
                ans.add(i);
            }
        }

        return ans;
    }
}