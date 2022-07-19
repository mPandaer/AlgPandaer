package stackandqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //优先队列法
        ArrayList<Integer> res = new ArrayList<>();
        //大顶堆
        PriorityQueue<Integer> queue = new PriorityQueue<>(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i<k;i++) {
            queue.add(nums[i]);
        }
        res.add(queue.peek());
        for (int i = k; i<nums.length;i++) {
            queue.remove(nums[i-k]);
            queue.add(nums[i]);
            res.add(queue.peek());
        }
        int index = 0;
        int[] resArray = new int[res.size()];
        for (int num : res) {
            resArray[index++] = num;
        }
        return resArray;

    }
}
