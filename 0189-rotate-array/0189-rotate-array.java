class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        
        int d=k%n;
        
        
        reverse(nums,0,n-d-1);
        reverse(nums,n-d,n-1);
        reverse(nums,0,n-1);
        return;
        
    }
    
    public static void reverse(int[] nums,int i,int j){
        
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        
        
    }
    
    public static void swap(int[] nums,int i,int j){
        
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return;
    }
}