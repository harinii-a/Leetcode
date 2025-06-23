class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int res[]=new int[2];
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                res = new int[]{left+1,right+1};
                break;
            }
            else if(numbers[left]+numbers[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return res;
    }
}