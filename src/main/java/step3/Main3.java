package step3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // 리스트를 먼저 만들고 상품 담기
        List<Product3> productList = new ArrayList<>();
        productList.add(new Product3("Galaxy S25", 1200000, 50, "최신 안드로이드 스마트폰"));
        productList.add(new Product3("iPhone 17", 1350000, 130, "Apple의 최신 스마트폰"));
        productList.add(new Product3("MacBook Pro", 2400000, 70, "M4 칩셋이 탑재된 노트북"));
        productList.add(new Product3("AirPods Pro", 350000, 100, "노이즈 캔슬링 무선 이어폰"));
        Category3 electronics = new Category3("전자제품", productList);

        // 의류 카테고리 추가
        List<Product3> clothingList = new ArrayList<>();
        clothingList.add(new Product3("후드티", 55000, 100, "두꺼운 소재"));
        clothingList.add(new Product3("청바지", 64000, 80, "와이드 핏 데님"));
        Category3 clothing = new Category3("의류", clothingList);

        // 전체 카테고리 리스트
        List<Category3> categories = new ArrayList<>();
        categories.add(electronics);
        categories.add(clothing);

        Customer3 user = new Customer3("홍길동", "hong@test.com", 1200000);

        System.out.println("사용자 로그인 정보 ");
        System.out.println("이름: " + user.name);
        System.out.println("누적 주문 금액: " + user.totalSpent + "원");
        System.out.println("현재 등급: " + user.grade);

        // 시스템을 만들 때 리스트를 넘기기
        CommerceSystem3 system = new CommerceSystem3(categories);

        // 시스템의 시작 버튼(start) 누르기
        system.start();
    }
}