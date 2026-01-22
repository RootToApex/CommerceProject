package step3;

import java.util.List;

public class Category3 {
    public String categoryName; // 상품별 카테고리
    public List<Product3> products; // 해당 카테고리에 속한 상품들

    public Category3(String categoryName, List<Product3> products) {
        this.categoryName = categoryName;
        this.products = products;
    }
}
