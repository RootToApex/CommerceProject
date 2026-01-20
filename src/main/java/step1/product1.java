package step1;

public class product1 {

    public String name; //상품명
    public int price; // 가격
    public String description; // 설명
    public int stock; // 재고수량

    // 상품 생성 시 정보 채우기
    public product1(String name, int price, int stock, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;

    }
}
