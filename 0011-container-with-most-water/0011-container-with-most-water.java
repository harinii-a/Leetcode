class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length -1;
        while(i<j){
            int h=height[i]<=height[j]? height[i]:height[j];
            int w = j-i;
            int area = h*w;
            if(area>max){
                max=area;
            }
            if(height[i]<height[j]){
                i++;
            }
            else if(height[i]==height[j]){
                i++;
                j--;
            }
            else{
                j--;
            }
            
        }
        return max;
    }
}