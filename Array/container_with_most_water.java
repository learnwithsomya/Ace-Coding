class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left=0, b=n-1, max_water=0;
        while(left < right){
            int min_h = Math.min(height[a], height[b]);
            int curr_water= (right - left) * min_h ;
            if (curr_water > max_water){
                max_water=curr_water;
            }
            if (height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_water;
    }
}