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
        if(head == null) {
            return null;
        }

        int count = 1;
        ListNode curr = head;
        ListNode last = head;

        while(last.next != null) {
            last = last.next;
            count++;
        }

        int index = 0;
        ListNode prev = null;

        while(curr != null) {
            if(index == count - n) {
                if(prev != null) {
                    prev.next = curr.next;
                    curr = null;
                } else {
                    head = head.next;
                }

                break;
            }
            
            index++;
            prev = curr;
            curr = curr.next;
        }

        return head;
    }
}
