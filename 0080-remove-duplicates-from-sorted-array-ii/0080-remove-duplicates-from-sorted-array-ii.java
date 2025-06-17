class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr=2;
        for(int i=2;i<nums.length;i++){
            if(nums[ptr-2]!=nums[i]){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}