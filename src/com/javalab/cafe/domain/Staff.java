package com.javalab.cafe.domain;

/**
 * 사원 데이터
 *  * int staffId : 주문처리직원
 * String staffName : 사원명
 * String position : 사원 직급
 * int salary : 사원 급여
 */
public class Staff {
    private int staffId;
    private String staffName;
    private String position;
    private int salary;

    public Staff() {
    }
    public Staff (int staffId, String staffName, String position, int salary) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.position = position;
        this.salary = salary;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
