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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cursorList1 = list1;
        ListNode cursorList2 = list2;

        if(list1 == null) {
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode result = new ListNode(0);
        ListNode cursor = result;

        while(list1 != null || list2 != null){
            ListNode newNode = new ListNode();

            if(list1 == null && list2 != null) {
                newNode.val = list2.val;
                list2 = list2.next;
            } 
            else if(list2 == null && list1 != null){
                newNode.val = list1.val;
                list1 = list1.next;
            }
            else if( list1.val <= list2.val) {
                newNode.val = list1.val;
                list1 = list1.next;
            }
            else {
                newNode.val = list2.val;
                list2 = list2.next;
            }

            cursor.next = newNode;
            cursor = cursor.next;
        }

        ListNode resultDummy = result.next;
        result = null;
        return resultDummy;
    }
}