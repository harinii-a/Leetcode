// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length()!=t.length()) return false;
//         HashMap<Character,Character> map = new HashMap<>();
//         for(int i=0;i<t.length();i++){
//             if(!(map.containsKey(t.charAt(i)))){
//                 if(!(map.containsValue(s.charAt(i)))){ 
//                     map.put(t.charAt(i),s.charAt(i));
//                 }
//             }
//             if(map.containsKey(t.charAt(i))){
//                 if(map.get(t.charAt(i)) != s.charAt(i)){
//                     return false;
//                 }
//             }
//             if(map.containsValue(s.charAt(i))){
//                 if(map.get(s.charAt(i)) != t.charAt(i)){
//                     return false;
//                 }
//             }


//         }

//         return true;
//     }
// }

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)){
                char res = map.get(a);
                if(res!=b) return false; 
            }

            if(!map.containsKey(a)){
                if(map.containsValue(b)) return false;
            }

            //key ila value iruku
            map.put(a,b);

        }
        return true;
    }
}