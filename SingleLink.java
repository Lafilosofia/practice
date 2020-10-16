package com.tencent;

/**
 * 单链表
 */
public class SingleLink {
    /**
     * 链表类中持有节点的引用
     */
    private Node head;

    public SingleLink() {
        this.head = new Node();
    }

    class Node {
        Object data;//数据区域
        Node next;//指向下一个区域

        /**
         * 头节点
         */
        Node() {
            this.data = "head";
            this.next = null;
        }

        /**
         * 非头节点
         *
         * @param data
         */
        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * 链表中新增节点 尾部插入
     * 重点：将新节点链到头节点的尾部
     *
     * @param val
     */
    public Node insertTail(Object val) {
        Node newNode = new Node(val);
        //如何链接到头的尾部
        //1.当头节点为空 2.不为空要移动
        Node temp = null;
        temp = head;
        //循环当不为空时进行查询
        while (temp.next != null) {
            //让指针一直移动
          temp = temp.next;

        }
        temp.next = newNode;
        newNode.next = null;

        return newNode;
    }

    //头部插入
    public Node insertHead(Object val) {

        Node newNode= new Node(val);

        newNode.next = head.next;
        head.next = newNode;
        return newNode;
    }

    //打印链表
    public void show() {
        //链表所有的操作必须从头节点开始
        Node temp = null;
        temp = head;
        while (temp.next!= null) {
            //不输出头节点
            temp = temp.next;
            System.out.print("["+temp.data + "->" + temp.next+",");


        }
        System.out.println("]");
    }
}
