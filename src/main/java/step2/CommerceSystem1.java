package step2;

import java.util.ArrayList;
import java.util.List;

public class CommerceSystem1 { // 핵심 로직

    public List<product2> products = new ArrayList<>();

    public void addProduct(product2 product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("실시간 커머스 플랫폼 - 전자제품");
        for (int i = 0; i < products.size(); i++) {
            product2 p = products.get(i);
            System.out.printf("%d. %-15s | %,10d원 | %3d개 | %-25s%n",(i + 1), p.name, p.price, p.stock, p.description);
        }
    }
}
