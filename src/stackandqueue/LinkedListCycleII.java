package stackandqueue;

import java.util.HashSet;

/**
 * https://leetcode.cn/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
       //快慢指针
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = head;
                while(temp != fast) {
                    temp = temp.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
