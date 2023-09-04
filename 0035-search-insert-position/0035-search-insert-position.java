class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index=search(nums,target);
        
        if(index!=-1)return index;
        int i=0;
        while(i<nums.length){
            if(target<nums[i])return (i);
            else{i++;}
        }
        return nums.length;
        
    }
    
     public int search(int[] nums, int target) {
        
        int start=0;
        int end=nums.length-1;
        int mid=Math.abs((end+start)/2);
        
        while(start<=end){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
                mid=Math.abs((end+start)/2);
            }
            else{
                start=mid+1;
                mid=Math.abs((end+start)/2);
            }
        }
        return -1;
    }
}