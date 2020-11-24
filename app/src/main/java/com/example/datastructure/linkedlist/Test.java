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
    }
}
