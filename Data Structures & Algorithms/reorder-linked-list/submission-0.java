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
    public void reorderList(ListNode head) {
        ListNode mid = head;
        ListNode last = head;
        
        while(last != null && last.next != null) {
            mid = mid.next;
            last = last.next.next;
        }

        ListNode reverseLast = null;

        while(mid != null) {
            ListNode temp = mid.next;
            mid.next = reverseLast;
            reverseLast = mid;
            mid = temp;
        }

        ListNode curr = head;

        while(reverseLast.next != null) {
            ListNode tempHead = curr.next;
            ListNode tempRevese = reverseLast.next;
            curr.next = reverseLast;
            reverseLast.next = tempHead;
            reverseLast = tempRevese;
            curr = tempHead;
        }
    }
}
