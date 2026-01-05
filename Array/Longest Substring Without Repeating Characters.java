class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0 ; 
        int[] charIndex = new int[128];
        Arrays.fill(charIndex,-1);
        int maxLen = 0 ;
        for(int right=0;right<n;right++){
            if(charIndex[s.charAt(right)]>-1){
                left = charIndex[s.charAt(right)]+1;
            }
            charIndex[s.charAt(right)]=right;
            maxLen = Math.max(maxLen,(right-left+1));
        }
        return maxLen;
    }
}
