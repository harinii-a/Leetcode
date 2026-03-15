class Solution {

    public static int tryy(int arr[],int h , int mid){
       
        int ptr = 0;
        long hours = 0;
        int add = mid -1;

        for(int i=0;i<arr.length;i++){
            hours = hours + ((arr[i] + add)/mid);
            if(hours>h) break;
        }

        if(hours<=h) return 0;
        else return 1;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]) max = piles[i];
        }

        int left = 1;
        int right = max;
        int mid = 0;
        int res = -1;

        while(left<=right){
            mid = (left+right)/2;
       
            int num = tryy(piles,h,mid);
            if(num==1){
                left = mid+1;
                continue;
            }
            else{
                res = mid;
            }
            right = mid-1;

        }

        return res;

    }
}