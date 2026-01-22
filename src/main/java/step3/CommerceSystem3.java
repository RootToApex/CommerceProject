package step3;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem3 { // 핵심 로직 (실질적으로 일함)
    // product 리스트가 아닌 'category 리스트' 가져오기
    public List<Category3> categories;

    // Main에서 카테고리 목록을 전달받아 시스템으로
    public CommerceSystem3(List<Category3> categories) {
        this.categories = categories;
    }

    // main에 있던 반복문과 입력 처리
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) { // 사용자가 0을 누를 때까지 종료하지 않는 무한루프
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");

            for (int i = 0; i < categories.size(); i++) {
                System.out.println((i + 1) + ". " + categories.get(i).categoryName);
            }
            System.out.println("0. 종료      | 프로그램 종료");
            System.out.println("종료를 원하면 0을 입력하세요: ");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("커머스 플랫폼을 종료합니다");
                break; // 루프를 빠져나가 종료
            } else if (input >= 1 && input <= categories.size()) {
                // 선택한 카테고리 안의 상품 목록으로 이동
                Category3 selectedCategory = categories.get(input - 1);
                showProductMenu(selectedCategory, sc); // 상품 메뉴 전용 함수
            } else {
                System.out.println("잘못된 번호입니다");
            }
        }
        sc.close();
    }

    public void showProductMenu(Category3 category, Scanner sc) {
        while (true) {
            System.out.println("[ " + category.categoryName + " 카테고리 ]");
            // 카테고리 안에 있는 상품 리스트를 꺼내기
            List<Product3> products = category.products;

            // 반복문을 상품을 하나 하나 보여주기
            for (int i = 0; i < products.size(); i++) { // size를 이용해 범위 설정
                // i번째 상품을 꺼내 'p'라는 손으로 잡는 느낌
                Product3 p = products.get(i);
                // %-15s: 15칸 확보 왼쪽 정렬
                // %,10d: 10칸 확보 천단위 콤마
                // printf로 정리하기 (기존 형식 유지)
                System.out.printf("%d. %-15s | %,10d원 | %3d개 | %-25s%n",
                        (i + 1), p.name, p.price, p.stock, p.description);
            }

            System.out.println("0. 뒤로가기");
            System.out.print("입력 : ");
            int input = sc.nextInt();

            if (input == 0) {
                break;
            } else if (input >= 1 && input <= products.size()) {
                // 선택한 상품의 상세 정보 출력
                Product3 selectedProduct = products.get(input - 1);
                System.out.println("선택한 상품: " + selectedProduct.name);
                System.out.println("가격: " + selectedProduct.price + "원");
                System.out.println("설명: " + selectedProduct.description);
                System.out.println("재고: " + selectedProduct.stock + "개");
            } else {
                System.out.println("잘못된 번호입니다");
            }
        }
    }
}