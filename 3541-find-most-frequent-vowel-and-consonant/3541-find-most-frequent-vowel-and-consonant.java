class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        //  maximum vowel and consonant frequency
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }

        return maxVowel + maxConsonant;
    }
}