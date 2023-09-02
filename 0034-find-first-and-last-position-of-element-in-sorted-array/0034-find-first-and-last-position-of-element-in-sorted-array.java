class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        
        int mid=Math.abs((end+start)/2);
        int index=-1;
        
        while(start<=end){
            if(nums[mid]==target){
                index=mid;
                break;
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
        int[] ans=new int[2];
        
        if(index==-1){
            ans[0]=-1;
            ans[1]=-1;
        }
        else{
            int Z=index;
            int O=index;
            int Z_ans=index;
            int O_ans=index;
            while( O<n){
                
                if(nums[O]!=target){
                    O_ans=O-1;
                    break;
                }
                else{
                    O_ans=O;
                    O++;
                }
                
            }
            while( Z>=0){
                
                if(nums[Z]!=target){
                    Z_ans=Z+1;
                    break;
                }
                else{
                    Z_ans=Z;
                    Z--;
                }
                
            }
            ans[0]=Z_ans;
            ans[1]=O_ans;
        }
        
        return ans;
        
    }
}