class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        int index =0;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }
}