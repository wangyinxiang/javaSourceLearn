package com.learn.test.Integer;

public class TestInteger {

    public static void main(String[] args) {
        int i = 1;
        Integer j =  new Integer(1);
        Integer k =  new Integer(1);
        Integer x = 128;
        Integer y = 128;
        Integer.parseInt("1");
        System.out.println(Integer.toString(2,2));
        System.out.println(Integer.toString(-2));
        System.out.println(j.equals(k));
        System.out.println(j == k);
        System.out.println(x.equals(y));
        System.out.println(x == y);

        x = Integer.reverse(x);
        System.out.println(x);
        x = Integer.reverse(x);
        System.out.println(x);
    }
}
