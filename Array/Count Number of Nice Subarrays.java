class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return nice(nums,k) - nice(nums,k-1);
    }
    private int nice(int[] nums, int k){
        int count = 0 ;
        int n = nums.length;
        int left = 0 ;
        int right = 0 ; 
        int sum = 0; 
        while(right<n){
            
            sum = sum + nums[right]%2; 
            
            while(sum>k){
                sum = sum - nums[left]%2;
                left+=1;
            }
            count = count + (right-left+1);
            right+=1;
            
        }
        return count;
    }
}
