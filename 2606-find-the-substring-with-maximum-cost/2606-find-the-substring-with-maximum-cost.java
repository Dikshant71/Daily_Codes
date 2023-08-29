class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        
        int n=s.length();
        
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),i);   
        }
        
        for (int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                sum+=vals[map.get(s.charAt(i))];
            }
            else{
                
                char ch=s.charAt(i);
                
                int cha=ch;
                
                int a='a';
                sum+=(ch-a)+1;
            }
            
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
            
        }
        if(maxSum<0){
            return 0;
        }
        return maxSum;
    }
}