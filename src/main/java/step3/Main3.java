package step3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // 리스트를 먼저 만들고 상품 담기
        List<Product3> productList = new ArrayList<>();
        productList.add(new Product3("Galaxy S25", 1200000, 500, "최신 안드로이드 스마트폰"));
        productList.add(new Product3("iPhone 16", 1350000, 300, "Apple의 최신 스마트폰"));
        productList.add(new Product3("MacBook Pro", 2400000, 500, "M3 칩셋이 탑재된 노트북"));
        productList.add(new Product3("AirPods Pro", 350000, 1000, "노이즈 캔슬링 무선 이어폰"));

        // 시스템을 만들 때 리스트를 넘기기
        CommerceSystem3 system = new CommerceSystem3(productList);

        // 시스템의 시작 버튼(start) 누르기
        system.start();
    }
}