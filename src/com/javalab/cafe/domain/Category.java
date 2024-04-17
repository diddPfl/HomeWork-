package com.javalab.cafe.domain;

/**
 * 카테고리 클래스
 * - 속성(멤버 변수)
 * int caNumber : 카테고리 번호
 * String caName : 카테고리명
 * String info : 카테고리 설명
 */
public class Category {
    private int caNumber; // 카테고리 번호
    private String caName; // 카테고리명
    private String info; // 카테고리 설명

    public Category() {
    }

    public Category(int caNumber, String caName, String info) {
    this.caNumber = caNumber;
    this.caName = caName;
    this.info = info;
    }

    public int getCaNumber() {
        return caNumber;
    }
    public void setCaNumber(int caNumber) {
            this.caName = caName;
    }
    public String getCaName() {
        return caName;
    }
    public void setCaName(String caName) {
        this.caName = caName;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
