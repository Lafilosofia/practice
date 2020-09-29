/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
        }

public class Subject13 {
    //通过改变指向删除节点
    public ListNode deleteNode(ListNode head, int val) {
        //空链表
        if (head == null) return null;
        //至少一个节点
        boolean find = false;
        //新增头节点
        ListNode phead = new ListNode(-1);
        phead.next = head;
        //slow指向要删除的节点的前驱,quick指向要删除的节点
        ListNode slow = phead;
        ListNode quick = phead.next;
        while (quick != null) {
            if (quick.val == val) {
                find = true;
                break;
            }
            slow = slow.next;
            quick = quick.next;
        }
        //如果没找到就不用删,返回原链表
        if (!find) return head;
        //找到了要删,改变前驱指向即可
        slow.next = quick.next;
        return phead.next;
    }
}
