package stackandqueue;

/**
 * https://leetcode.cn/problems/reverse-nodes-in-k-group/
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 0; cur != null && i<k-1; i++) {
            cur = cur.next;
        }
        if (cur == null) return head;
        ListNode next = cur.next;
        reverse(head,cur);
        head.next = reverseKGroup(next,k);

        return cur;

    }
    public void reverse(ListNode start, ListNode tail) {
        if (start == null || start.next == null) return;
        ListNode prev = null;
        ListNode cur = start;
        ListNode last = tail.next;
        while(cur != last && cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

    }

    public static void main(String[] args) {
        ReverseNodesInKGroup r = new ReverseNodesInKGroup();
        ListNode head = r.init();
        r.reverseKGroup(head,2);

    }

    public ListNode init(){
        ListNode prev = new ListNode(-1);
        ListNode temp = prev;
        for (int i = 0; i<5;i++) {
            temp.next = new ListNode(i+1);
            temp = temp.next;
        }
        return prev.next;
    }
}
