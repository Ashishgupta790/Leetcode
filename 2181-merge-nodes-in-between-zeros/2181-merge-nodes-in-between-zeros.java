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
    public ListNode mergeNodes(ListNode head) {

        ListNode current = head.next;
        ListNode result = head;

        int sum = 0;

        while (current != null) {

            if (current.val != 0) {
                sum += current.val;
            } 
            else {
                result.next = new ListNode(sum);
                result = result.next;
                sum = 0;
            }

            current = current.next;
        }

        return head.next;
    }
}