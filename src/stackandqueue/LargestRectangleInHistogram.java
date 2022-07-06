package stackandqueue;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        //暴力解法
        for (int i = 0; i< heights.length; i++) {
            for (int j = i; j< heights.length; j++) {
                area = Math.max(area,(j-i +1) * getMin(heights,i,j));
            }
        }
        return area;

    }

    private int getMin(int[] nums,int left, int right) {
        int min = nums[left];
        for (int i = left+1; i<= right; i++) {
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}
