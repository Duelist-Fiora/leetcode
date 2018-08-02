class Solution {
    public int minSubArrayLen(int s,int[]nums){

        int i=0;
        int j=-1;
        int sum=0;
        int res=nums.length+1;

        while(i<nums.length){

            if(sum<s &&j+1<nums.length){
                j++;
                sum=sum+nums[j];
            }else{
                if(j-i+1<res &&sum>=s){
                    res=j-i+1;
                }
                sum=sum-nums[i];
                i++;
            }
        }

        if(res==nums.length+1){
            return 0;
        }

        return res;
    }
}}