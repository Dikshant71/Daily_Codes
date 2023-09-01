class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        
        int el=nums[0];
        int count=1;
        for (int i=1;i<n;i++){
            if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                el=nums[i];
            }
        }
        return el;
    }
}