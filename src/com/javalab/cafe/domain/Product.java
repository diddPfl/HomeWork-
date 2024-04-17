package com.javalab.cafe.domain;

/**
 * 상품 클래스
 * int proNumber : 상품번호
 * String proName : 상품명
 * int caNumber :카테고리번호
 * int price : 판매단가
 */
public class Product {
    private int proNumber;
    private String proName;
    private int caNumber;
    private int price;

    public Product()   {
    }

    public Product(int proNumber, String proName, int caNumber, int price) {
        this.proNumber = proNumber;
        this.proName = proName;
        this.caNumber = caNumber;
        this.price = price;
    }

    public int getProNumber() {
        return proNumber;
    }
    public void setProNumber(int proNumber) {
        this.proNumber = proNumber;
    }
    public String getProName() {
        return proName;
    }
    public void setProName(String proName)  {
        this.proName = proName;
    }
    public int getCaNumber() {
        return caNumber;
    }
    public void setCaNumber(int caNumber)  {
        this.caNumber = caNumber;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price)  {
        this.price = price;
    }

}
