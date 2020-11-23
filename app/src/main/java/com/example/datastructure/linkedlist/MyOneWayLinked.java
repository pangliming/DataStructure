package com.example.datastructure.linkedlist;

/**
 * @author pangliming
 * 单向链表
 */
public class MyOneWayLinked<T> implements LinkedListInterface<MyOneWayLinked.Node, T> {
    /**
     * 头结点
     */
    private Node<T> head;

    @Override
    public Node get(int i) {
        return null;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public void add(T element) {
        //head为null时，链表为空
        if (null == head) {

        }
    }

    @Override
    public void add(T element, int index) {

    }


    /**
     * 链表中的位置
     *
     * @param <T>
     */
    class Node<T> {
        Node next;
        T value;

        public Node(Node next, T value) {
            this.next = next;
            this.value = value;
        }
    }
}
