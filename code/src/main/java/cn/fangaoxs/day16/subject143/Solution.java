package cn.fangaoxs.day16.subject143;

import cn.fangaoxs.ListNode;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/09/03/18:10
 * @Description:
 */
class Solution {

    public static void reorderList(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        int i = 0;
        while (head!=null){
            System.out.println(i+"->>"+ head);
            map.put(i,head);
            head = head.next;
            i++;
        }
        int size = map.size();
        System.out.println("map.get(2).next = " + map.get(2).next);
        System.out.println("map.get(3) = " + map.get(3));
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reorderList(root);
        /*while (root!=null){
            System.out.println("root = " + root);
            root = root.next;
        }*/
    }

}
