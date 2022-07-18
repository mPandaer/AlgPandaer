package stackandqueue;

import java.util.HashSet;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        //用set
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode cur = head;
        while(cur != null) {
            if (hashSet.contains(cur)){
                return cur;
            }
            hashSet.add(cur);
            cur = cur.next;
        }
        return null;
    }
}
