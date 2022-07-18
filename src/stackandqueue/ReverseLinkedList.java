package stackandqueue;

/**
 * https://leetcode.cn/problems/reverse-linked-list/
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //魔化后的双指针
        ListNode cur = head;
        if (head == null) return head;
        while(head.next != null) {
            ListNode temp = head.next.next;
            head.next.next = cur;
            cur = head.next;
            head.next = temp;
        }

        return cur;
    }
}
