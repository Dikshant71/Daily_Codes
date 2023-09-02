class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n=arr.length;
        
        int count=arr[0]-1;
        if(count>=k){
            return k;
        }
        int check=count+1;
        
        int i=0;
        while(i<n && count!=k){
            if(arr[i]==check){
                
                i++;
            }
            else{
                count++;
                
            }
            check++;
        }
         if(count==k){
            return check-1;
        }
        else{
           check+=(k-count)-1;
        }
        return check;
        
    }
}