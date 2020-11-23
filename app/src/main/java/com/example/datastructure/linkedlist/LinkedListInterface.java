package com.example.datastructure.linkedlist;

/**
 * @author pangliming
 * 链表接口
 */
public interface LinkedListInterface<E, T> {

    /**
     * 获取链表元素
     *
     * @param i 位置
     * @return
     */
    E get(int i);

    /**
     * 移除链表元素
     *
     * @param i
     */
    void remove(int i);


    /**
     * 添加元素e
     *
     * @param element
     */
    void add(T element);

    /**
     * 添加元素e到i位置
     *
     * @param element
     * @param index
     */
    void add(T element, int index);


}
