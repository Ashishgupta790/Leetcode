class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum =0;
        int sum2 =0;
        for(int i = 0; i<=2*n; i++){
            if( i % 2 == 0){
                sum +=  i;
            }else{
                sum2 += i;
            }
        }
        while(sum2 != 0){
            int temp = sum2;
            sum2 = sum % sum2;
            sum = temp;
        }
        return sum;
    }
}