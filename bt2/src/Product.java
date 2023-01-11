public class Product {
    private String productCode;
    private String name;
    private double price;
    private int number;
    private double promotion;

    public Product (String productCode, String name, double price, int number, double promotion) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.number = number;
        this.promotion = promotion;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public double getPromotion() {
        return promotion;
    }

    public double getPriceold() {
        return this.price*number;
    }

    public double getPricePro() {
        return (this.price - this.price*this.promotion/100)*number;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPromotion(double promotion) {
        this.promotion = promotion;
    }
}
