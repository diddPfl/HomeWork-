package com.javalab.cafe.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 주문데이터
 * int odNumber : 주문번호
 * String date : 주문날짜
 * int staffId : 주문처리직원
 * int proNumber : 상품번호
 * int sales : 판매수량
 */
public class Order {
    private int odNumber;
    private LocalDateTime date;
    private int staffId;
    private int proNumber;
    private int sales;

    public Order() {
    }

    public Order (int odNumber, String date, int staffId, int proNumber, int sales) {
        this.odNumber = odNumber;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.date = LocalDateTime.parse(date, formatter);
        this.staffId = staffId;
        this.proNumber = proNumber;
        this.sales = sales;
    }
    public int getOdNumber() {
        return odNumber;
    }
    public void setOdNumber(int odNumber) {
        this.odNumber = odNumber;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public int getProNumber() {
        return proNumber;
    }
    public void setProNumber(int proNumber) {
        this.proNumber = proNumber;
    }
    public int getSales() {
        return sales;
    }
    public void setSales(int sales) {
        this.sales = sales;
    }

}
