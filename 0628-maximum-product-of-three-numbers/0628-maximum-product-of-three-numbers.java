class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int num1 = nums[nums.length - 1];
         int num2 = nums[nums.length - 2];
         int num3 = nums[nums.length - 3];

         int product = num1*num2*num3;
        
         int num4 = nums[0];
         int num5 = nums[1];
         int num6 = nums[nums.length-1];

         int pro = num4*num5*num6;
         int pro2 = (pro);
          int ans;
         if(product > pro2){
            ans = product;
         }else {
            ans = pro2;
         }

         
         return ans;
    }
}