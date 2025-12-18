/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) {
            head = null;
            return head;
        }
        int counter = 1;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode lead = prev;
        ListNode lag = prev;
        for(int i=0;i<n;i++){
            lead = lead.next;
        }
        while(lead!=null && lead.next!=null){
            lead = lead.next;
            lag = lag.next;
        }

        lag.next = lag.next.next;

        return prev.next;
    }
}