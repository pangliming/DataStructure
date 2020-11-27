package com.example.datastructure.linkedlist;

/**
 * @author pangliming
 */
public class Test {
    public static void main(String[] args) {
        MyOneWayLinked<String> linked = new MyOneWayLinked<>();
        linked.add("1");
        linked.add("2");
        linked.add("3");
        linked.add("4");
        linked.add("5");
        linked.add("6");
        linked.add("7");
        linked.add("8");
        for (int i = 0; i < linked.getSize(); i++) {
            System.out.println("链表" + i + "节点:" + linked.get(i));
        }
        linked.remove(0);
        linked.remove(3);
        linked.remove(linked.getSize() - 1);
        System.out.println("链表长度：" + linked.getSize());
        System.out.println("=======================");
        for (int i = 0; i < linked.getSize(); i++) {
            System.out.println("链表" + i + "节点:" + linked.get(i));
        }

        MyOneWayLinked<Integer> linked1 = new MyOneWayLinked<>();
        linked1.add(4);
        linked1.add(7);
        linked1.add(8);
        linked1.add(3);
        linked1.add(2);
        linked1.add(5);
        linked1.add(6);
        linked1.add(9);
        System.out.println("链表反转：=====================");
        MyOneWayLinked.Node node = linked1.getHead();
        System.out.print("原始数据：");
        while (node!=null){
            System.out.print(node.value+";");
            node = node.next;
        }
        System.out.println();
//        AlgorithmAboutLinked.chainlistinversion(linked1.getHead());
        AlgorithmAboutLinked.chainlistinversion1(linked1.getHead());
        //测试
        MyOneWayLinked.Node node1 = new MyOneWayLinked.Node(null, 3);
        MyOneWayLinked.Node node2 = node1;
        node1.value = 0;
        System.out.println("node1:"+node1.value+"#####"+"node2:"+node2.value);


        MyOneWayLinked<Integer> sortNode1 = new MyOneWayLinked();
        sortNode1.add(3);
        sortNode1.add(4);
        sortNode1.add(5);
        sortNode1.add(7);
        sortNode1.add(9);

        MyOneWayLinked<Integer> sortNode2 = new MyOneWayLinked<>();
        sortNode2.add(2);
        sortNode2.add(4);
        sortNode2.add(6);
        sortNode2.add(8);
        sortNode2.add(10);


        AlgorithmAboutLinked.sortMerge(sortNode1.getHead(), sortNode2.getHead());
    }
}
