class NumArray {
    private int[] pre;
    public NumArray(int[] nums) {
        pre = new int[nums.length+1];
        pre[0]=0;
        for(int i = 1;i<=nums.length;i++){
            pre[i]=nums[i-1]+pre[i-1];
        }
        
    }
    
    public int sumRange(int left, int right) {
        int res = pre[right+1]-pre[left];
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */