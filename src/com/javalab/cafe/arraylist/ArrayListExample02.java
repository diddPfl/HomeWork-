package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample02 {
    public static void main(String[] args) {
        // human type의 객체를 저장 할 수 있는 arraylist 객체 생성
        ArrayList<Human> humanlist = new ArrayList<Human>();

        // Human h1 = new Human("홍길동",20);
        // humanlist.add(h1);
        // 위의 내용 간략히
        humanlist.add(new Human("홍길동",20));
        humanlist.add(new Human("김철수",30));
        humanlist.add(new Human("이영희",40));

        System.out.println("1 : " + humanlist.get(0).getName() + " " + humanlist.get(0).getAge());
        System.out.println("2 : " + humanlist.get(1).getName() + " " + humanlist.get(1).getAge());
        System.out.println("3 : " + humanlist.get(2).getName() + " " + humanlist.get(2).getAge());

        for (Human h : humanlist) {
            System.out.println(h.getName() + " " + h.getAge());
        }

    }
}
class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}