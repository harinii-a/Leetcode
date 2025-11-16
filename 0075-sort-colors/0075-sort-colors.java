// class Solution {
//     public void sortColors(int[] nums) {
//         int mid = 0;
//         int low = 0;
//         int a=0;
//         int b=0;
//         int high = nums.length-1;
//         //for( int i = 0 ;  i < nums.length ; i++)
//         while(mid<=high)
//         {
//             if(nums[mid]== 2){
//                 //swap(nums[mid],nums[high]);
//                 a=nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = a;
//                 high--;
//             }
//             else if(nums[mid]==1){
//                 mid++;
//             }
//             else{
//                 //swap(nums[mid],nums[low]);
//                 b=nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = b;

//                 mid++;
//                 low++;
//             }
//         }
//         //System.out.println(nums);
    
//     }
// }

class Solution{
    public void sortColors(int[] nums){
        int index;
        for(int i=0;i<nums.length;i++){
            index = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[index]>nums[j]){
                    int temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                }
            }
        }


    }
   
}