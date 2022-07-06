package stackandqueue;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        //暴力解法二
        for (int i = 0; i< heights.length; i++) {
            maxArea = Math.max(maxArea,(getRight(heights,heights[i],i) - getLeft(heights,heights[i],i) - 1) * heights[i]);
        }
        return maxArea;
    }

    private int getLeft(int[] nums, int val, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] < val) return i;
        }
        return -1;
    }

    private int getRight(int[] nums, int val, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] < val) return i;
        }
        return nums.length;
    }
}
