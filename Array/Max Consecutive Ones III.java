class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0 ;
        int n = nums.length;
        int maxi = 0;
        int zeroes = 0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zeroes+=1;
            }
            if(zeroes>k){
                if(nums[left]==0){
                    zeroes-=1;
                }
                left+=1;
            }
            if(zeroes<=k){
                maxi = Math.max(maxi,right-left+1);
            }  
            
        }
        return maxi;
    }
}
