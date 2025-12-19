class Solution {
    public int countElements(int[] nums, int k) {
        if(k == 0) return nums.length;

        Arrays.sort(nums);
        int i = nums.length -1 - k;
        while(i >= 0 && nums[i] == nums[i + 1]){
            i--;
        }
        if(i < 0) return 0;
        return i + 1;
    }
}