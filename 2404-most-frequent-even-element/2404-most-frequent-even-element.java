class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            } 
        }
        int maxFreq=-1,ans=-1;
        for(int k:map.keySet()){
            
                    if(map.get(k)>maxFreq){
                   maxFreq=map.get(k);
                        ans=k;
                }
                else if(map.get(k)==maxFreq && ans>k){
                        ans=k;                        
                }                    
            }
            return ans;
    }
}