class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        
        for(int i=0;i<=n;i++){
            if(nums[i]==i)return i;
        }
        return -1;
        
    }
}