class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<len1;i++){
            set.add(nums1[i]);
        }
        Set<Integer> res = new HashSet<Integer>();
        for(int val:nums2){
            if(set.contains(val)){
                res.add(val);
            }
        }
        int i=0;
        int resarr[] = new int[res.size()];
        for(int a:res){
            resarr[i] = a;
            i++;
        }
        return resarr;
    }
}