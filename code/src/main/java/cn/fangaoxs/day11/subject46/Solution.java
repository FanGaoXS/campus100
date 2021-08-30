package cn.fangaoxs.day11.subject46;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/08/29/23:32
 * @Description:
 */
public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        dfs(result,integers,nums);
        return result;
    }

    private static void dfs(List<List<Integer>> lists,List<Integer> integers,int[] nums){
        if (integers.size()== nums.length) {
            lists.add(new ArrayList<Integer>(integers));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i])) {
                //如果该组排列已经包含该数字则进入下一次循环
                continue;
            }
            integers.add(nums[i]);
            dfs(lists, integers, nums);
            integers.remove(integers.size()-1); //去掉最后一个元素，以保证该次能全部遍历
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> lists = permute(nums);
        lists.forEach(integerList -> {
            System.out.println("integerList = " + integerList);
        });
    }
}
