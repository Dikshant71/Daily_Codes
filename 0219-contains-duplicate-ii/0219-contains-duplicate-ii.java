class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int start=0;
        
        int n=nums.length;
        
        while(start<n-1){
            int end=start+1;
            while(end<n){
                if(Math.abs(end-start)>k){
                    break;
                }
                if(nums[start]==nums[end]){
                    return true;
                }
                else{
                    end++;
                }
            }
            start++;      
            }
        return false;
        
    }
}