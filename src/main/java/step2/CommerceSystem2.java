package step2;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem2 { // 핵심 로직 (실질적으로 일함)
    public List<Product2> products;

    // Main에서 보낸 리스트를 '통째로' 받아서 저장
    public CommerceSystem2(List<Product2> products) {
        this.products = products;
    }

    // main에 있던 반복문과 입력 처리
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

            // 반복문을 이용해 바구니에 있는 상품을 하나 하나 보여주기
            for (int i = 0; i < products.size(); i++) {// size를 이용해 범위 설정하기
                // i번째 상품을 꺼내 'p'라는 손으로 잡는 느낌
                Product2 p = products.get(i);
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
                Product2 selectedProduct = products.get(input - 1);
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
