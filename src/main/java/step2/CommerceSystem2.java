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
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

        // 반복문으로 출력하기
        for (int i = 0; i < products.size(); i++) {
            Product2 p = products.get(i);
            System.out.printf("%d. %-15s | %,d원 | %3d개 | %s%n",
                    (i + 1), p.name, p.price, p.stock, p.description);
        }

        // 입력 받기 (Main에 있던 걸 여기로 옮기기)
        Scanner sc = new Scanner(System.in);
        System.out.println("종료를 원하면 0을 입력하세요");
        System.out.print("입력 : ");
        int input = sc.nextInt();

        if (input == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
        }
    }
}
