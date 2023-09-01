class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list=new ArrayList<>();
        
        int n=nums.length;
        
         int el1=-1,el2=-1;
        int count1=0,count2=0;
        
        for(int i=0;i<n;i++){
            
            if(el1==nums[i]){
                count1++;
            }
            else if(el2==nums[i]){
                count2++;
            }
            else if(count1==0 && el2!=nums[i]){
                count1=1;
                el1=nums[i];
            }
             else if(count2==0 && el1!=nums[i]){
                count2=1;
                el2=nums[i];
            }
            else{
                count1--;
                count2--;
            }
            
        }
        
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(el1==nums[i]){
                count1++;
            }
            else if(el2==nums[i]){
                count2++;
            }
        }
        if(count1>n/3){
            list.add(el1);
        }
        if(count2>n/3){
            list.add(el2);
        }
        
        
        return list;
        
    }
}