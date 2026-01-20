package step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<product1> products = new ArrayList<>();

        products.add(new product1("Galaxy S25", 1200000, 500, "최신 안드로이드 스마트폰"));
        products.add(new product1("iPhone 16", 1350000, 300, "Apple의 최신 스마트폰"));
        products.add(new product1("MacBook Pro", 2400000, 500, "M3 칩셋이 탑재된 노트북"));
        products.add(new product1("AirPods Pro", 3500000, 1000, "노이즈 캔슬링 무선 이어폰"));

        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

        for (int i = 0; i < products.size(); i++) {
            product1 p = products.get(i); // p라는 변수를 넣어야 함
            System.out.printf("%d. %-15s | %,10d원 | %3d개 | %-25s%n",(i + 1), p.name, p.price, p.stock, p.description);




        }
        Scanner sc = new Scanner(System.in);
        System.out.println("종료를 원하면 0을 입력하세요");
        int input = sc.nextInt();
        if (input == 0) {
            System.out.println("커머스 플랫폼을 종료합니다");

        }


    }
}

