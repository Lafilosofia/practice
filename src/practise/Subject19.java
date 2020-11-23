package Subject.src;

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class Subject19 {
    public int[] linknode(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < print.length; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }

    class ListNode1 {
        int val;
        ListNode next;

        ListNode1(int x) {
            val = x;
        }
    }
}
