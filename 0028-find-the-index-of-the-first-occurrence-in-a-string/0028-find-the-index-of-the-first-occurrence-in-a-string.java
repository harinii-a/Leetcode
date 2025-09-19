class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()<=0) return -1;
        int n = haystack.length();
        int m = needle.length();
        int len = n-m;
        for(int i=0;i<=len;i++){
            if((haystack.substring(i,i+m)).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}