package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.cn/problems/implement-stack-using-queues/
 */
public class MyStack {
    Queue<Integer> queue = new LinkedList<>();


    public void push(int x) {
        queue.offer(x);
        for (int i = 1; i<queue.size(); i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }


}
