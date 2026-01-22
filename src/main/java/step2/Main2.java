package step2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // 리스트를 먼저 만들고 상품 담기
        List<Product2> productList = new ArrayList<>();
        productList.add(new Product2("Galaxy S25", 1200000, 50, "최신 안드로이드 스마트폰"));
        productList.add(new Product2("iPhone 17", 1350000, 130, "Apple의 최신 스마트폰"));
        productList.add(new Product2("MacBook Pro", 2400000, 70, "M4 칩셋이 탑재된 노트북"));
        productList.add(new Product2("AirPods Pro", 350000, 100, "노이즈 캔슬링 무선 이어폰"));

        // 시스템을 만들 때 리스트를 넘기기
        CommerceSystem2 system = new CommerceSystem2(productList);

        // 시스템의 시작 버튼(start) 누르기
        system.start();
    }
}