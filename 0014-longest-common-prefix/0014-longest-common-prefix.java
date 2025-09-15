class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len==1) return strs[0];
        if(len==0) return "";
    
        Arrays.sort(strs);
        int a=0;
        int count=0;
        String res="";
      int len1=strs[0].length();
        while(a < len1){
            if(strs[0].charAt(a)==strs[len-1].charAt(a)){
                count++;
                a++;
            }
            else{
                return strs[0].substring(0,count);
            }
        }

        return strs[0].substring(0,count);
    }
}