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

    /**两个有序链表合并成一个有序链表
     * @param node1
     * @param node2
     */
    public static void sortMerge(MyOneWayLinked.Node node1, MyOneWayLinked.Node node2){
        System.out.println("合并有序链表：");
        MyOneWayLinked.Node test = recursionMergeSort(node1, node2);
        int i = 0;
        while (test != null) {
            if (i == 15) {
                break;
            }
            System.out.print(test.value+";");
            test = test.next;
            i++;
        }

    }


    /**递归合并两个有序链表
     * @param node1
     * @param node2
     * @return
     */
    public static MyOneWayLinked.Node recursionMergeSort(MyOneWayLinked.Node<Integer> node1, MyOneWayLinked.Node<Integer> node2){
        if (null == node1 && null == node2) {
            return null;
        }
        if (null == node1){
            return node2;
        }
        if (null == node2){
            return node1;
        }
        if (node1.value < node2.value){
            node1.next = recursionMergeSort(node1.next, node2);
            return node1;
        }else {
            System.out.print("node1:"+node1.value+"#node2:"+node2.value);
            System.out.println();
            node2.next = recursionMergeSort(node1, node2.next);
            System.out.print("node1:"+node1.value+"#node2:"+node2.value);
            System.out.println();
            return node2;
        }




    }

}
