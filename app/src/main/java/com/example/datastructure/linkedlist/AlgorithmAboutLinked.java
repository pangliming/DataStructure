package com.example.datastructure.linkedlist;

/**
 * @author pangliming
 * 关于链表的算法
 */
public class AlgorithmAboutLinked {

    /**
     * 链表反转
     *
     * @param node
     */
    public static void chainlistinversion(MyOneWayLinked.Node node) {
        if (null == node) {
            return;
        }
        MyOneWayLinked.Node pre = null;
        MyOneWayLinked.Node next;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        System.out.println();
        System.out.print("反转数据：");
        while (pre != null) {
          System.out.print(pre.value+";");
          pre = pre.next;
        }
    }

    /**递归方式反转
     * @param node
     */
    public static void chainlistinversion1(MyOneWayLinked.Node node){
        MyOneWayLinked.Node test = recursionchainlist(node);
        System.out.println();
        int i = 0;
        while (test != null) {
            if (i == 10) {
                break;
            }
            System.out.print(" ##"+test.value+";");
            test = test.next;
            i++;
        }
    }

    /**概念上不清楚造成的不清楚：
     * 引用所指向的对象发生改改变，引用自然改变
     *
     * @param node
     * @return
     */
    public static MyOneWayLinked.Node recursionchainlist(MyOneWayLinked.Node node){

        if ( node == null || node.next == null){
            return node;
        }
        MyOneWayLinked.Node tempNode = recursionchainlist(node.next);
        System.out.println("#"+node.value+"#");
        node.next.next = node;
        node.next = null;

        System.out.print(tempNode.value + ";");



        return tempNode;
    }

}
