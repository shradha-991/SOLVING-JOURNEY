class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] anss=new int[n];
        anss[0] = 1;
        for(int i=1;i<nums.length;i++){
            anss[i]=anss[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            anss[i]*=right;
            right*=nums[i];
        }
        return anss;
    }
}