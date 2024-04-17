package com.javalab.excute;

import com.javalab.cafe.data.ArrayDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;
import com.javalab.cafe.domain.Staff;

/**
 * 카페관리 시스템
 * - 주문, 사원, 상품, 카테고리 도메인 클래스를 이용한 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 정보를 배열에 저장하고 관리
 * - 데이터 전담 클래스를 객체러 생성하여 기초 데이터 생성 작업
 */
public class CafeManagementArray {
    public static void main(String[] args) {
        // 데이터 전용 클래스 객체 생성, 생성자에서 데이터가 만들어진다.
        ArrayDatabase db = new ArrayDatabase();

        // 카테고리 정보 출력
        Category[] Categories = db.getCategories(); // 데이터 전담 객체에서 카테고리 정보 가져옴
        showCategories(Categories);

        // 상품 정보 출력
        Product[] products = db.getProducts();
        showProducts(products);

        // 주문 정보 출력
        Order[] orders = db.getOrders();
        showOrders(orders);

        Staff[] staffs = db.getStaffs();
        showStaffs(staffs);

    }
    public static void showCategories(Category[] categories) {
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t카테고리명\t설명");
        System.out.println("------------------------------------");
        for (Category c : categories) {
            System.out.println(c.getCaNumber() + "\t" + c.getCaName() + "\t" + c.getInfo());
        }
    }

    public static void showProducts(Product[] products) {
        System.out.println();
        System.out.println("상품 정보");
        System.out.println("상품번호\t상품명\t카테고리번호\t가격");
        System.out.println("------------------------------------");
        for (Product p : products) {
            System.out.println(p.getCaNumber() + "\t" + p.getProName() + "\t" + p.getProNumber() + "\t" + p.getPrice());
        }
    }
    public static void showOrders(Order[] orders) {
        System.out.println();
        System.out.println("주문 정보");
        System.out.println("주문번호\t날짜\t직원번호\t상품번호\t판매량");
        System.out.println("------------------------------------");
        for (Order o : orders) {
            System.out.println(o.getOdNumber() + "\t" + o.getDate() + "\t" + o.getStaffId() + "\t" + o.getProNumber() + "\t" + o.getSales());
        }
    }
    public static void showStaffs(Staff[] staffs) {
        System.out.println();
        System.out.println("직원 정보");
        System.out.println("직원번호\t이름\t직급\t급여");
        System.out.println("------------------------------------");
        for (Staff s : staffs) {
            System.out.println(s.getStaffId() + "\t" + s.getStaffName() + "\t" + s.getPosition() + "\t" + s.getSalary());
        }
    }
}
