package stackandqueue;

import java.util.HashSet;

/**
 * https://leetcode.cn/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        //用Set查重
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode cur = head;
        while(cur != null) {
            if (hashSet.contains(cur)){
                return true;
            }
            hashSet.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
