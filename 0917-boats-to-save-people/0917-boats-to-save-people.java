class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int j=people.length -1;
        int count=0;
        int i=0;
        while(i<=j){
            if(people[i]+people[j]<= limit){
                count++;
                i++;
                j--;
            }
            else{
                count++;
                j--;
            }
        }
        return count;
    }
}