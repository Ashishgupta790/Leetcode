class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int index = 0;
        int i = 0;
        for( i = 0; i<n;i++){
           arr[index] = nums[i];
           index++;
        }
        for(int j = n-1 ;j>=0;j--){
            arr[index] = nums[j];
            index++;
        }

        return arr;
    }
}