package com.learn.test.string;

public class TestString {

    public static void main(String[] args) {
        String s = new String("swing");
        s.substring(0,1);
        s.indexOf("w");
        s.split("i");
        s.hashCode();


        String c = "20201015";
        System.out.println(Integer.parseInt(c) < 20201016);
    }
}
