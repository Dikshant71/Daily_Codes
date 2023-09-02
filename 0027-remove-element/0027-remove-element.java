class Solution {
    public int removeElement(int[] nums, int val) {
        
        
        int n=nums.length-1;
        if(n<0){
            return 0;
        }
        
        int i=0;
        while(i<n){
            if(nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[n];
                nums[n]=temp;
                n--;
            }
            else {
                i++;
            }
        }
        
        if(nums[i]==val){
            i-=1;
        }
        
        
        
        return (i+1);
        
        
    }
}