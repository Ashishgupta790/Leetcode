class Solution {
    public int[] separateDigits(int[] nums) {
        
        // First find total number of digits
        int total = 0;
        for (int num : nums) {
            total += String.valueOf(num).length();
        }

        int[] answer = new int[total];
        int index = 0;

        // Separate digits
        for (int num : nums) {
            String str = String.valueOf(num);

            for (int i = 0; i < str.length(); i++) {
                answer[index++] = str.charAt(i) - '0';
            }
        }

        return answer;
    }
}
