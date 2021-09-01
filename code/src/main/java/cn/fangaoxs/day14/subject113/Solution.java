package cn.fangaoxs.day14.subject113;

import cn.fangaoxs.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/09/01/21:00
 * @Description:
 */
public class Solution {
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        if (root == null) return lists;
        int sum = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        dfs(root,targetSum,sum,integers,lists);
        return lists;
    }
    public static void dfs(TreeNode node,
                           int targetSum,
                           int sum,
                           List<Integer> integers,
                           List<List<Integer>> lists){
        //进入dfs的node一定不为null
        System.out.println("node.val = " + node.val);
        sum += node.val;
        integers.add(node.val);
        if (node.left==null&&node.right==null){ //叶子节点
            if (sum==targetSum) {
                System.out.println("sum = " + sum);
                System.out.println("integers = " + integers);
                lists.add(integers);
            }
            System.out.println("integers = " + integers);
            integers.remove(integers.size()-1);
            integers = new ArrayList<>(integers);
            System.out.println("integers = " + integers);
        }
        if (node.left!=null){
            dfs(node.left,targetSum,sum,integers,lists);
        }
        if (node.right!=null){
            dfs(node.right,targetSum,sum,integers,lists);
        }
    }
}
