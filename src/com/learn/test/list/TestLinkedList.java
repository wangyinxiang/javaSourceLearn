package com.learn.test.list;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.get(0);
        list.poll();
        list.push("2");
    }
}
