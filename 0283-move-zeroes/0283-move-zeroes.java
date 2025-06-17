class Solution {
    public void moveZeroes(int[] nums) {
        int val=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[val] = nums[i];
                val++;
            }
        }

        while(val < nums.length){
            nums[val]=0;
            val++;

        }


    }
}



// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n = nums.length;
//         int j = 0;
//         for(int i = 1 ; i < n ; i ++){
//             if(nums[j]==0){
//                 if(nums[i]!=0){
//                     int temp = nums[j];
//                     nums[j] = nums[i];
//                     nums[i] = temp;
//                     j++;
//                 }
//                 else{}
//             }
//             else{
//                 j++;
//             }
//         }
        
//     }
// }