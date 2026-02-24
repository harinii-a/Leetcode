class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder st = new StringBuilder();
        int small = (len1>=len2)? len2 : len1;
        int i;
        for(i=0;i<small;i++){
            st.append(word1.charAt(i));
            st.append(word2.charAt(i));
        }

        while(len1>i){
            st.append(word1.charAt(i));
            i++;
        }
        while(len2>i){
            st.append(word2.charAt(i));
            i++;
        }
        
        return st.toString();

        
    }
}