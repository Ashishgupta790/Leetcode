class Solution {
    public int smallestNumber(int n, int t) {

        if( n <t){
            return t;
        }

        while(n<10){
            for(int j = 0; j< 8; j++){
                if((n +j ) % t == 0 && (n+j) < 10 ){
                    return n+j;
                } else if((n+j) >= 10){
                    return 10;
                }
            }
        }
        for(int i = 0; i<=n+t;i++){
           
            int s = n+i;
            int p = s%10;
                s/= 10;
                 
            int O = p*s;

            if(O % t == 0){
                return n+i;
            }
        }
        return -1;
    }
}