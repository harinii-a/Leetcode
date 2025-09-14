class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder r = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            r.append(arr[i]);
            if(i!=0){
                r.append(" ");
            }
        }
        return r.toString().trim();
    }
}