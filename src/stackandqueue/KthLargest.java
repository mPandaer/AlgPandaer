package stackandqueue;

import java.util.PriorityQueue;

/**
 * https://leetcode.cn/problems/kth-largest-element-in-a-stream/
 */
public class KthLargest {
    private final PriorityQueue<Integer> queue;
    private final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        }else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();

    }
}
