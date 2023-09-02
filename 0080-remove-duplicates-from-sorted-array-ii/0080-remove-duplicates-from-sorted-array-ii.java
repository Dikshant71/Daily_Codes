class Solution {
    public int removeDuplicates(int[] nums) {
       

       int count=0;
       int el=nums[0];
       int n=nums.length;

       int i=0;

       while(i<n){
           if(el==nums[i]){
               count++;

               if(count>2){
                 int temp=nums[i];
                     for(int j=i;j<n-1;j++){
                      nums[j]=nums[j+1];
                      }
                 nums[n-1]=temp;
                  n--;
                }
              else{
                 i++;
              }
           }
           else{
               el=nums[i];
               count=1;
               i++;
           }
           
       } 
       return n;
    }

    
}