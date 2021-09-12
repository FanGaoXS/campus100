package cn.fangaoxs.day23.subject104;

import cn.fangaoxs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/09/10/21:07
 * @Description:
 *                  104. 二叉树的最大深度
 *                  https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution {
    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxDepth = 0;
        while (!queue.isEmpty()){
            maxDepth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return maxDepth;
    }

    private int maxDepth;

    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        maxDepth = Integer.MIN_VALUE;
        dfs(root, 1);
        return maxDepth;
    }

    private void dfs(TreeNode node, int depth){
        if (node.left == null &&node.right == null) {   //没有左右子树了（叶子节点）
            maxDepth = Math.max(maxDepth,depth);    //返回最大深度
            return;
        }
        depth++;    //深度+1
        if (node.left!=null) {
            //向左边搜索
            dfs(node.left, depth);
        }
        if (node.right!=null) {
            //向右边搜索
            dfs(node.right, depth);
        }
        depth--;    //深度-1（状态恢复）
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        /*int maxDepth2 = maxDepth2(root);
        System.out.println("maxDepth2 = " + maxDepth2);*/
    }
}
