class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length<1){
            return 0;
        }
        Arrays.sort(nums);
        int cons=1;
        int maxcons=1;
        for(int i=0;i<nums.length-1;i++){
            
            if( nums[i]==nums[i+1]-1){
                cons+=1;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                cons=1;
            }
            
            maxcons=Math.max(maxcons,cons);    
        }
        return maxcons;
        
    }
}