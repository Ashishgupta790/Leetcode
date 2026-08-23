class Solution {
    public int numberOfSteps(int num) {
        if(num==0){
            return 0;
        }
        int step = 1;
        while( num >1){
            if(num % 2 == 0){
                step++;
                num /= 2;
            }else{
                num-=1;
                step++;
            }
        }
        return step;
    }
}