package step4;

public class Product4 {

    private String name; //상품명
    private int price; // 가격
    private String description; // 설명
    private int stock; // 재고수량

    // 상품 생성 시 정보 채우기
    public Product4(String name, int price, int stock, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }
}
