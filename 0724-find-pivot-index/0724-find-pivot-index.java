class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int right= total-leftsum-nums[i];
            if(leftsum == right){
                return i;
            }
            else{
                leftsum+=nums[i];
            }
        }
        return -1;
        
    }
}