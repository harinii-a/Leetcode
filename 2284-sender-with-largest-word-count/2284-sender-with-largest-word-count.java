class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        

        HashMap<String,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String,Integer>> q = new PriorityQueue<>((a,b)->{
            if(!(a.getValue().equals(b.getValue()))){
                return b.getValue() - a.getValue();
            }
            return b.getKey().compareTo(a.getKey());
        });

        for(int i=0;i<messages.length ;i++){
            String arr[] = messages[i].split(" ");
            int num = arr.length;
            map.put(senders[i], map.getOrDefault(senders[i],0)+num);
        }

        for(Map.Entry<String,Integer> e : map.entrySet()){
            q.offer(e);
        }
      
        return q.poll().getKey();
        
    }
}