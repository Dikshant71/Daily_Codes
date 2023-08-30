class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(map.get(i)>=0){
              nums[pos]= map.get(i);
                pos+=2;
            }
            else{
                nums[neg]=map.get(i);
                neg+=2;
            }
        }
        return nums;
        
        
        
    }
}