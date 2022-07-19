package stackandqueue;

import java.util.*;

/**
 * https://leetcode.cn/problems/sliding-window-maximum/submissions/
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //简洁的双端队列法
        Deque<Integer> deque = new LinkedList<>();
        if (nums ==null || nums.length < k) return nums;
        int[] res = new int[nums.length - k + 1];


        for (int i = 0; i<nums.length;i++) {
            //保证加入元素时，队列 由大到小
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.add(i);
            //------------------------------

            //判断队首是否在滑窗内部 i：队尾
            if (deque.peekFirst() <= i -k) {
                deque.pollFirst();
            }
            //判断是否建立好滑窗
            if (i + 1 >= k) {
                res[i+1-k] = nums[deque.peekFirst()];
            }
        }
        return res;
    }

}
