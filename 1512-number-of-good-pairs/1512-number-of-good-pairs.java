class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int goodPairs=0;
        
        for(int key:map.keySet()){
            int m=map.get(key);
            
            goodPairs+=m*(m-1)/2;
        }
        return goodPairs;
    }
}