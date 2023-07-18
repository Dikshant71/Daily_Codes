class Solution {
    public int removeDuplicates(int[] nums) {
        int N=nums.length; 
        int count=N;
		int start=0;
		int end =1;
		
		while(end!=N){
			if(nums[start]!=nums[end]){
			    nums[start+1]=nums[end];
				start++;
				end++;
			}
			else{
			    
				count--;
				end++;
			}
			

		}
		return count;
    }
}