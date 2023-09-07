class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int i=0;
        while(i<n){
            int k=target-nums[i];
            if(map.containsKey(k)){
                int[] arr=new int[]{map.get(k),i};
                return arr;
            }
            else{
                map.put(nums[i],i);
                i++;
            }
        }
         int[] arr=new int[]{-1,-1};
        return arr;
    }
}