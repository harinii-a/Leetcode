class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> map1 = new HashSet<>();
        for(int i=0;i<t.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)){
                char res = map.get(a);
                if(res!=b) return false; 
            }

            if(!map.containsKey(a)){
                if(map1.contains(b)) return false;
            }
            //key ila value iruku
            map.put(a,b);
            map1.add(b);


        }
        return true;
    }
}