package com.javalab.cafe.arraylist;

import com.javalab.cafe.domain.Staff;

import java.util.ArrayList;

public class ArrayListExample03 {
    public static void main(String[] args) {
        // staff 타입의 객체를 저장할 수 있는 arrylist 객체 생성
        ArrayList<Staff> staffList = new ArrayList<Staff>();
        staffList.add(new Staff(1001,"홍길동","대리", 3000));
        staffList.add(new Staff(1002,"영희","사원", 2000));
        staffList.add(new Staff(1003,"갑수","과장", 5000));

        printP(staffList);
    }
    private static void printP(ArrayList<Staff> staffList) {
        for (Staff s : staffList) {
            System.out.println(s.getStaffName() + " " + s.getPosition() + " " + s.getSalary());
        }
    }

}
