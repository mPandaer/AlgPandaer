package stackandqueue;

/**
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
@SuppressWarnings("all")
public class Problem2 {
    public ListNode swapPairs(ListNode head) {
        //递归
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        head.next = swapPairs(head.next.next);
        second.next = head;
        return second;
    }
}
