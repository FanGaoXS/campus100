package cn.fangaoxs.day2.subject1;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/08/20/17:40
 * @Description:
 */
class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,7,9,7,-2,7,9,-7};
        System.out.println("threeSum(nums) = " + threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        LinkedList<List<Integer>> lists = new LinkedList<>();
        if (nums.length < 3) return lists;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) break;                           // 如果当前已经大于0了，后面加起来会更大于0
            if (i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right && nums[left] == nums[left+1]) left++; // 去重
                    while (left<right && nums[right] == nums[right-1]) right--; // 去重
                    left++;
                    right--;
                }
                else if (sum < 0) left++;
                else if (sum > 0) right--;
            }
        }
        return lists;
    }
}
