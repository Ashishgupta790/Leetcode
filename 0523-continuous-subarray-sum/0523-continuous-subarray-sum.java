class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> RI = new HashMap<>();
        int sum = 0;
        RI.put(0,-1);

        for(int i =0; i<nums.length;i++){
            sum += nums[i];
            int rem  = sum % k;
            if(RI.containsKey(rem)){
                if(i - RI.get(rem) > 1){
                    return true;
                }
            } else{
                    RI.put(rem,i);
            }
        }
        return false;
    }
}