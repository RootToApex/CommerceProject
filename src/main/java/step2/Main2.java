package step2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 상품 담을 바구니 만들기
        CommerceSystem1 system = new CommerceSystem1();

        // 바구니에 상품 채우기
        // system.addProduct(): Main2에서 추가해달라는 명령만 내림
        system.addProduct(new product2("Galaxy S25", 1200000, 500, "최신 안드로이드 스마트폰"));
        system.addProduct(new product2("iPhone 16", 1350000, 300, "Apple의 최신 스마트폰"));
        system.addProduct(new product2("MacBook Pro", 2400000, 500, "M3 칩셋이 탑재된 노트북"));
        system.addProduct(new product2("AirPods Pro", 3500000, 1000, "노이즈 캔슬링 무선 이어폰"));

        system.displayProducts();
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

        // 0을 입력하면 종료하기
        Scanner sc = new Scanner(System.in);
        System.out.println("종료를 원하면 0을 입력하세요");
        int input = sc.nextInt();
        if (input == 0) {
            System.out.println("커머스 플랫폼을 종료합니다");

        }


    }

}