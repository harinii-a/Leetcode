class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c = t.charAt(i);
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            else{
                map.put(c,map.get(c)-1);
            }
        }
        return true;
    }
}