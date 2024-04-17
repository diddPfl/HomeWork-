package com.javalab.excute;

import com.javalab.cafe.data.ArrayListDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;
import com.javalab.cafe.domain.Staff;

import java.util.ArrayList;

/**
 * 카페 관리 시스템
 * - arraylistdatabase 클래스를 이용한 카페 관리 시스템
 * - 주문, 사용, 상품, 카테고리 정보를 arraylist에 저장하고 관리
 * - 데이터 전담 클래스를 만들어서 기토 데이터 생성 작업
 * - 여러개의 객체 즉, 주문+상품+직원 데이터를 for문을 이용하여 필터링(검색)
 */
public class CafeManagementArrayList {

    public static void main(String[] args) {
        // ArrayList 형태로 된 데이터베이스 객체 생성
        ArrayListDatabase db = new ArrayListDatabase();

        // 카테고리 ArrayList 객체 얻기 - 카테고리 정보 출력
        ArrayList<Category> categories = db.getCategoryList();
        showCategoryList(categories);

        // 상품 ArrayList 객체 얻기 - 상품 정보 출력
        ArrayList<Product> products = db.getProductList();
        showProductList(products);

        // 주문 ArrayList 객체 얻기 - 주문 정보 출력
        ArrayList<Order> orders = db.getOrderList();
        showOrderList(orders);

        // 직원 ArrayList 객체 얻기 - 직원 정보 출력
        ArrayList<Staff> staffs = db.getStaffList();
        showStaffList(staffs);

        // 상품 데이터 출력
        showProductswithCategoryName(products,categories);
        showProductswithCategoryName1(products,categories);

    } // end of main

    // 카테고리 정보 출력 - 상품번호, 상품명, 카테고리 id, 카테고리명, 가격
    public static void showCategoryList(ArrayList<Category> categories){
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t카테고리명\t설명");
        System.out.println("------------------------------------");
        for (Category c : categories) {
            System.out.println(c.getCaNumber() + "\t" + c.getCaName() + "\t" + c.getInfo());
        }
    }
    public static void showProductList(ArrayList<Product> products) {
        System.out.println();
        System.out.println("상품 정보");
        System.out.println("상품번호\t상품명\t카테고리번호\t가격");
        System.out.println("------------------------------------");
        for (Product p : products) {
            System.out.println(p.getCaNumber() + "\t" + p.getProName() + "\t" + p.getProNumber() + "\t" + p.getPrice());
        }
    }
    public static void showOrderList(ArrayList<Order> orders) {
        System.out.println();
        System.out.println("주문 정보");
        System.out.println("주문번호\t날짜\t직원번호\t상품번호\t판매량");
        System.out.println("------------------------------------");
        for (Order o : orders) {
            System.out.println(o.getOdNumber() + "\t" + o.getDate() + "\t" + o.getStaffId() + "\t" + o.getProNumber() + "\t" + o.getSales());
        }
    }
    public static void showStaffList(ArrayList<Staff> staffs) {
        System.out.println();
        System.out.println("직원 정보");
        System.out.println("직원번호\t이름\t직급\t급여");
        System.out.println("------------------------------------");
        for (Staff s : staffs) {
            System.out.println(s.getStaffId() + "\t" + s.getStaffName() + "\t" + s.getPosition() + "\t" + s.getSalary());
        }
    }
    public static void showProductswithCategoryName(ArrayList<Product> products, ArrayList<Category> categories) {
        System.out.println();
        System.out.println("상품 및 카테고리 정보");
        System.out.println("상품번호\t상품명\t카테고리id\t카테고리명\t가격");
        System.out.println("--------------------------------------------");
        for (Product p : products) {
            for (Category c : categories) {
                if (p.getCaNumber() == c.getCaNumber()) {
                    System.out.println(p.getProNumber() + "\t" + p.getProName() + "\t" +p.getCaNumber()+ "\t" + c.getCaName() + "\t" + p.getPrice());
                }
            }
        }
    }
    public static void showProductswithCategoryName1(ArrayList<Product> products, ArrayList<Category> categories) {
        System.out.println();
        System.out.println("상품 및 카테고리 정보");
        System.out.println("상품번호\t상품명\t카테고리id\t카테고리명\t가격");
        System.out.println("------------------------------------");
        for (Product p : products) {
            int caNumber = p.getCaNumber();
            String categoryName = "";
            if (caNumber != 0) {
                for (Category c : categories) {
                    if (c.getCaNumber() == caNumber) {
                        categoryName = c.getCaName();
                        break;
                    }
                }
            }
            System.out.println(p.getProNumber() + "\t" + p.getProName() + "\t" +p.getCaNumber()+ "\t" +
                    categoryName + "\t" + p.getPrice());
        }
    }
}