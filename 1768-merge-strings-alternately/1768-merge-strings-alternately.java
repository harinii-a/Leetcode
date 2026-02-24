class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        String res="";
        int small = (len1>=len2)? len2 : len1;
        int i;
        for(i=0;i<small;i++){
            res = res + word1.charAt(i);
            res = res +word2.charAt(i);
        }

        while(len1>i){
            res += word1.charAt(i);
            i++;
        }
        while(len2>i){
            res+=word2.charAt(i);
            i++;
        }
        
        return res;

        
    }
}