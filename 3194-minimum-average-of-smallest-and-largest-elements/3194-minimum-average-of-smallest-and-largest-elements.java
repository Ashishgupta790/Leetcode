/*class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double avg =0;
         double average = 0; 
        
         avg += nums[nums.length/2] + nums[nums.length/2 -1] ;
         average = avg/2;
        
        return average;
    }
}*/
import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        double minAverage = Double.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            double average = (nums[left] + nums[right]) / 2.0;

            minAverage = Math.min(minAverage, average);

            left++;
            right--;
        }

        return minAverage;
    }
}