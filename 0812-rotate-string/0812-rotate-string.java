class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String r = s + s;
        if(r.contains(goal)) return true;
        return false;
        
    }
}