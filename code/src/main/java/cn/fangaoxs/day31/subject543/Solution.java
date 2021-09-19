package cn.fangaoxs.day31.subject543;

import cn.fangaoxs.TreeNode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/09/18/22:53
 * @Description:
 */
public class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        return 0;
    }

    //求节点到叶子节点的长度（也就是最大深度）
    public static int maxDepth(TreeNode root){
        //叶子节点
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        int maxDepth = maxDepth(root);
        System.out.println("maxDepth = " + maxDepth);
    }
}
