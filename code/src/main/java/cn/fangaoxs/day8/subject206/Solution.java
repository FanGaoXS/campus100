package cn.fangaoxs.day8.subject206;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/08/26/17:21
 * @Description:
 */
public class Solution {
    public static ListNode reverseList(ListNode head) {
        if (head==null) return null;
        LinkedList<Integer> integers = new LinkedList<>();
        while (head!=null){
            integers.add(head.val);
            head = head.next;
        }
        ListNode node = new ListNode();
        ListNode resultNode = node;
        for (int i = integers.size()-1; i >=0; i--) {
            node.next = new ListNode(integers.get(i));
            node = node.next;
        }
        return resultNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(5))))));
        ListNode node = reverseList(head);
        while (node!=null){
            System.out.println("node.val = " + node.val);
            node = node.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
