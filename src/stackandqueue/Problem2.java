package stackandqueue;

import java.util.LinkedList;

/**
 * https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
@SuppressWarnings("all")
public class Problem2 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        //用栈的思想实现
        LinkedList<ListNode> stack = new LinkedList<>();
        ListNode cur = head;
        ListNode temp = new ListNode(-1);
        head = temp;
        while(cur != null && cur.next != null) {
            for (int i =0; i<2; i++,cur = cur.next){
                stack.push(cur);
            }
            for (int i = 0; i<2;i++) {
                temp.next = stack.pop();
                temp = temp.next;
            }
        }
        temp.next = cur;
        return head.next;
    }
}
