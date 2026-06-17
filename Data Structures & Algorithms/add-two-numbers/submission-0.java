/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        int mem = 0;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode result = new ListNode(0);
        ListNode tSum = result;

        while (temp1 != null || temp2 != null || mem != 0) {
            int s1 = temp1 == null ? 0 : temp1.val;
            int s2 = temp2 == null ? 0 : temp2.val;

            int sum = s1 + s2 + mem;

            mem = sum / 10;

            tSum.next = new ListNode(sum % 10);

            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }

            tSum = tSum.next;
        }

        return result.next;
    }
}