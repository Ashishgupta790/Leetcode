class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum  = 0;
        int mul = 1;
        while(n>0){
        
        int rem = n % 10;
          n /= 10;
        sum +=rem;
        mul *=rem;
        
     }
      int total = sum + mul;  
        
        return original % total == 0;
   
    }
}