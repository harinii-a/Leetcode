class Solution {
    public String largestOddNumber(String num) {
        int ptr = num.length()-1;
        for(int i=ptr;i>=0;i--){
            int n = (int)num.charAt(i);
            if(n%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}