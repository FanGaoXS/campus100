package cn.fangaoxs.day14.subject101;

import cn.fangaoxs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/09/01/18:31
 * @Description:
 */
public class Solution {
    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return false;
        return check(root.left,root.right);
    }

    private static boolean check(TreeNode leftNode,TreeNode rightNode){
        if (leftNode==null&&rightNode==null) return true;   //如果左右节点都为null说明相同
        if (leftNode==null||rightNode==null) return false;  //在上面条件的前提下，如果左右节点有一个为null了说明不相同
        if (leftNode.val==rightNode.val) {
            //如果两个节点值也相同则往下继续执行同样的检查
            //左节点穿左子树则右节点传右子树，左节点传右子树则右节点传左子树。
            return check(leftNode.left,rightNode.right)&&check(leftNode.right,rightNode.left);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,new TreeNode(2,null,new TreeNode(3)),new TreeNode(2,null,new TreeNode(3)));
        boolean result = isSymmetric(root);
        System.out.println("result = " + result);
    }
}
