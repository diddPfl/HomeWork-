package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample01 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("apple");
        strList.add("banana");
        strList.add("cherry");

        System.out.println("첫번째 객체: " + strList.get(0));
        System.out.println("두번째 객체: " + strList.get(1));
        System.out.println("세번째 객체: " + strList.get(2));

        // 저장된 객체의 개수
        System.out.println("크기: " + strList.size());

        for (String s : strList) {
            System.out.println(s);
        }
    }

}
