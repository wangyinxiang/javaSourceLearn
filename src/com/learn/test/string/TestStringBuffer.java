package com.learn.test.string;

public class TestStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("b");

        sb.insert(1, "z");
        sb.toString();
        sb.reverse();
    }
}
