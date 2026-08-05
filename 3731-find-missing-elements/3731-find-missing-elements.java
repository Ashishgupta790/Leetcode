class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int y = nums[0];

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i<nums.length; i++){
            while(nums[i] != y +1){
                arr.add(++y);
            }
            y = nums[i];
        }
        return arr;
    }
}