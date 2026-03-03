class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length <=1) return nums;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            q.offer(e);
            if(q.size()>k){
                q.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            result.add(q.poll().getKey());
        }

        int arr[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;



        
    }
}