class Solution {
    public long[] sumOfThree(long num) {
        long[] arr=new long[3];
       
        
        if(num%3!=0){
            long[] array=new long[0];
            return array;
        }
        
        double n=((double)num/3)-1;
        
        
            arr[0]=(long)n;
            arr[1]=(long)n+1;
            arr[2]=(long)n+2;
        
        return arr;
        
    }
}