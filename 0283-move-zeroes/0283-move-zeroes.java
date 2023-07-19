class Solution {
    public void moveZeroes(int[] nums) {
        
        int zeros=0;
        int nonZeros=1;
        
        while(nonZeros<nums.length){
            if(nums[zeros]==0 && nums[nonZeros]!=0){
                int temp=nums[zeros];
                nums[zeros]=nums[nonZeros];
                nums[nonZeros]=temp;
                
                zeros++;
                nonZeros+=1;
            }
            else if(nums[zeros]==0 && nums[nonZeros]==0){
                nonZeros++;
            }
            else{
                zeros++;
                nonZeros+=1;
            }
            
        }
        
    }
}