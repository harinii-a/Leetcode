class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        for(int i=0;i<s.length();i++){
            sum1+=s.charAt(i);
        }
        int sum2 = 0;
        for(int i=0;i<t.length();i++){
            sum2+=t.charAt(i);
        }

        int max = (sum1>sum2)? sum1 : sum2;
        int min = (sum1<=sum2)? sum1 : sum2;
        int diff = max - min;
        char rs = (char) diff;
        return rs;
    }
}