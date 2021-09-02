package cn.fangaoxs.day15.subject142;

import cn.fangaoxs.ListNode;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/09/02/19:57
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null){ //迭代链表
            if (!set.add(head)) return head;    //如果向set中添加节点失败，说明这是第二次访问了（即重复）
            head = head.next;
        }
        return null;
    }

}
