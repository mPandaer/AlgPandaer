package stackandqueue;

import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //普通队列法
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i<k;i++) {
            queue.add(nums[i]);
        }
        maintain(queue);
        res.add(queue.peek());
        for (int i = k ;i<nums.length; i++) {
            if (queue.size() >= k) queue.remove();
            queue.add(nums[k]);
            maintain(queue);

            res.add(queue.peek());
        }

        int[] resArray = new int[res.size()];
        int index = 0;
        for (Integer num : res) {
            resArray[index++] = num;
        }
        return resArray;

    }

    public void maintain(Queue<Integer> queue) {
        int max = queue.peek();
        for (Integer num : queue) {
            if (num > max) max = num;
        }
        while(!queue.isEmpty()) {
            if (queue.peek() != max) queue.remove();
            else return;
        }


    }
}
