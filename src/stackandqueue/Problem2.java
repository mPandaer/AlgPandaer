package stackandqueue;

/**
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
@SuppressWarnings("all")
public class Problem2 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        head = second;

        while(first != null && second != null) {
            ListNode temp = second.next;
            second.next = first;
            first.next = temp != null && temp.next != null ? temp.next : temp;
            second  = temp != null && temp.next != null ? temp.next : null;
            first = temp != null ? temp : null;
        }
        return head;
    }
}
