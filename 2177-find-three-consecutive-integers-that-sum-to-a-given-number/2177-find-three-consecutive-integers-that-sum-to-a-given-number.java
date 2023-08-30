class Solution {
    public long[] sumOfThree(long num) {
        long[] arr=new long[3];
        if(num==3){
            arr[0]=0;
            arr[1]=1;
            arr[2]=2;
            return arr;
        }
        
        double n=((double)num/3)-1;
        
        if(n%Math.round(n)==0){
            arr[0]=(long)n;
            arr[1]=(long)n+1;
            arr[2]=(long)n+2;
        }
        else{
            long[] array=new long[0];
            return array;
        }
        return arr;
        
    }
}