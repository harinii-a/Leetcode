class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int sum=0;
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            sum = nums[i]+arr[i-1];
            arr[i]=sum;
        }
        return arr;
    }
}