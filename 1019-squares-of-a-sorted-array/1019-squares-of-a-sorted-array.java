class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len];
        int i=len-1;
        int r=len-1;
        int l=0;
        while(l<=r){
            if(Math.abs(nums[l]) <= Math.abs(nums[r])){
                arr[i] = nums[r]*nums[r];
                r--;
                i--;
            }
            else{
                arr[i] = nums[l]*nums[l];
                i--;
                l++;
            }
            

        }
        return arr;
           
    }
}