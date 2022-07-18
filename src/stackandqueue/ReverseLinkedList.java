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
        if (head == null || head.next == null){
            return head;
        }

        ListNode newHead = null;
        ListNode current = head;
        while(current != null) {
            ListNode nextNode  = current.next;
            current.next = newHead;

            newHead = current;
            current = nextNode;
            if (nextNode != null) nextNode = nextNode.next;
        }
        return newHead;
    }
}
