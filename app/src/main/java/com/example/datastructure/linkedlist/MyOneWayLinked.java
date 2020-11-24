package com.example.datastructure.linkedlist;

/**
 * @author pangliming
 * 单向链表
 */
public class MyOneWayLinked<T> implements LinkedListInterface<MyOneWayLinked.Node, T> {
    /**
     * 头结点
     */
    private Node head;

    private Node<T> tail;

    /**
     * 链表长度
     */
    private int count;

    public MyOneWayLinked() {
        count = 0;
    }

    /**
     * 获取链表
     *
     * @param i 位置
     * @return
     */
    @Override
    public T get(int i) {
        if (count >= 0 && i < count) {
            Node<T> next = head;
            int index = 0;
            while (next != null) {
                if (index == i) {
                    return next.value;
                }
                next = next.next;
                index++;
            }
        }

        throw new IndexOutOfBoundsException();

    }

    @Override
    public void remove(int i) {
        if (null == head) {
            return;
        }
        if (i >= 0 && i < count) {
            if (0 == i) {
                head = head.next;
                count--;
                return;
            }
            Node<T> next = head;
            Node<T> pre = null;
            int index = 0;
            while (next != null) {

                if (index == (i - 1)) {
                    pre = next;
                }
                if (index == i) {
                    pre.next = next.next;
                }
                next = next.next;
                index++;

            }
            count--;
            return;
        }

        throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(T element) {
        //head为null时，链表为空
        if (null == head) {
            head = new Node<>(null, element);
            tail = head;
            count++;
            return;
        }

        Node<T> next = new Node<>(null, element);
        tail.next = next;
        tail = next;
        count++;
    }

    @Override
    public void add(T element, int index) {
        if (index < 0 && index > count) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getSize() {
        return count;
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
