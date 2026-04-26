// Last updated: 4/26/2026, 12:06:39 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode slow = head, fast = head;
15
16        while(fast != null && fast.next != null){
17            slow = slow.next;
18            fast = fast.next.next;
19
20            if(slow == fast){
21                return true;
22            }
23        }
24        return false;
25    }
26}