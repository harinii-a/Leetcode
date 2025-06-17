class Solution {
    public int[] applyOperations(int[] nums) {
        int ptr =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]*=2;
                nums[i]=0;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ptr]=nums[i];
                ptr++;
            }
        }

        for(int i=ptr;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
        }
}