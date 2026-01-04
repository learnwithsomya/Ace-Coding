class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int prod_r=1, prod_l=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=prod_r;
            prod_r= prod_r*nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=ans[i]*prod_l;
            prod_l=prod_l*nums[i];
        }
        return ans;
    }
}