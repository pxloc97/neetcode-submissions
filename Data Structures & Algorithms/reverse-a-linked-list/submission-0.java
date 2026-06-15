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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode reverseHead = new ListNode(head.val);

        while (head.next != null) {
            head = head.next;
            ListNode newNode = new ListNode(head.val, reverseHead);
            reverseHead = newNode;
        }

        return reverseHead;
    }
}
