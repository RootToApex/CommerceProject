package step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        // 상품 담을 바구니 만들기
        List<Product1> products = new ArrayList<>();

        // 바구니에 상품 채우기
        products.add(new Product1("Galaxy S25", 1200000, 500, "최신 안드로이드 스마트폰"));
        products.add(new Product1("iPhone 16", 1350000, 300, "Apple의 최신 스마트폰"));
        products.add(new Product1("MacBook Pro", 2400000, 500, "M3 칩셋이 탑재된 노트북"));
        products.add(new Product1("AirPods Pro", 3500000, 1000, "노이즈 캔슬링 무선 이어폰"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

            // 반복문을 이용해 바구니에 있는 상품을 하나 하나 보여주기
            for (int i = 0; i < products.size(); i++) {// size를 이용해 범위 설정하기
                // i번째 상품을 꺼내 'p'라는 손으로 잡는 느낌
                Product1 p = products.get(i);
                // %-15s: 15칸 확보 왼쪽 정렬
                // %,10d: 10칸 확보 천단위 콤마
                // printf로 정리하기
                System.out.printf("%d. %-15s | %,10d원 | %3d개 | %-25s%n", (i + 1), p.name, p.price, p.stock, p.description);
            }

            System.out.println("0. 종료          |  프로그램 종료");
            // 0을 입력하면 종료하기

            System.out.println("종료를 원하면 0을 입력하세요: ");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("커머스 플랫폼을 종료합니다");
                break;
            } else if (input >= 1 && input <= products.size()) {
                Product1 selectedProduct = products.get(input - 1);
                System.out.println("선택한 상품: " + selectedProduct.name);
                System.out.println("가격: " + selectedProduct.price + "원");
                System.out.println("설명: " + selectedProduct.description);
                System.out.println("재고: " + selectedProduct.stock + "개");
            } else {
                System.out.println("잘못된 번호입니다");
            }
        }
        sc.close();

    }
}
