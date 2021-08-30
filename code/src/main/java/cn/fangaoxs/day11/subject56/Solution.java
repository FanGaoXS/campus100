package cn.fangaoxs.day11.subject56;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/08/29/19:59
 * @Description:
 */
class Solution {
    public static int[][] merge(int[][] intervals) {
        //Array.sort和Comparator比较器排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0]; //根据[start,end]中的start来排序
            }
        });
        /*//冒泡排序
        for (int i = 0; i < intervals.length-1; i++) {
            for (int j = 0; j < intervals.length-i-1; j++) {
                if (intervals[j][0]>intervals[j+1][0]){
                    int[] temp = intervals[j+1];
                    intervals[j+1] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }*/
        ArrayList<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];                            //当前位置的区间的左边界
            int end = intervals[i][1];                              //当前位置的区间的右边
            int mergedLastStart = merged.get(merged.size()-1)[0];   //已经排序好的区间的最后一个区间的左边界
            int mergedLastEnd = merged.get(merged.size()-1)[1];     //已经排序好的区间的最后一个区间的右边界
            //如果当前区间的左边界比已经排序号的区间的最后一个区间的有边界大则说明一定不会有重叠
            if (start>mergedLastEnd){
                merged.add(intervals[i]);   //则直接将当前区间加入
            } else {    //否则会有重叠，合并后的右边界是取最大
                merged.set(merged.size()-1,new int[]{mergedLastStart,Math.max(end,mergedLastEnd)});
            }
        }
        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] resultInts = merge(intervals);
        for (int i = 0; i < resultInts.length; i++) {
            System.out.println();
            System.out.println("start = "+ resultInts[i][0]);
            System.out.println("end = "+ resultInts[i][1]);
            System.out.println();
        }
    }
}
