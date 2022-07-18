package stackandqueue;

/**
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
@SuppressWarnings("all")
public class Problem2 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode newHead = head.next;
        while(cur != null && cur.next != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
            if (cur != null && cur.next != null) temp.next = cur.next;
        }
        return newHead;
    }
}
