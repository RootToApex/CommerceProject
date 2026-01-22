package step4;

import java.util.List;

public class Category4 {
    private String categoryName; // 상품별 카테고리
    private List<Product4> products; // 해당 카테고리에 속한 상품들

    public Category4(String categoryName, List<Product4> products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public String getCategoryName() { return categoryName; }
    public List<Product4> getProducts() { return products; }
}
