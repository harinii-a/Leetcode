class Solution {

    public static int binarySearch(int left , int right, int target, int arr[][],int n){
        while(left<=right){
            int mid = (left+right) / 2;
            if(arr[n][mid]==target) return mid;
            if(arr[n][mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        int len = matrix.length;
        int innerlen = matrix[0].length -1;
        int index = -1;
        for(int i=0;i<len;i++){
            if(matrix[i][innerlen] >= target){
                index = i;
                break;
            }
        }
        if(index == -1) return res;
        int num = binarySearch(0,innerlen,target,matrix,index);
        if(num == -1) return res;
        else return true;
        
    }
}