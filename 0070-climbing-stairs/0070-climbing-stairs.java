class Solution {
    public int climbStairs(int n) {
     if( n  < 2){
            return n;
        }
        int i = 1;
        int j = 2;
        for(int k = 3; k<= n; k++){
            int c = i + j;
            i = j;
            j = c;

        }
        return j;
    }
}