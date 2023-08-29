class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list=new ArrayList<>();
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        int k=nums.length/3;
        
        for(int key:map.keySet()){
            if(map.get(key)>k){
                list.add(key);
            }
        }
        return list;
        
    }
}