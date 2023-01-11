public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("P1", "Áo",1000,2,10);
        products[1] = new Product("P2", "Quần",1500,2,15);
        products[2] = new Product("P3", "Giày",2000,1,20);
        products[3] = new Product("P4", "khăn",300,1,10);
        products[4] = new Product("P5", "mũ",500,1,10);
        System.out.println("Danh sách sản phẩm : ");
        for (Product i : products
        ) {
            System.out.println(i);
        }
        System.out.println("Tổng tiền SP chưa có khuyến mãi : " + sum(products));
        System.out.println("Tổng tiền SP sau khuyến mãi : " + sale(products));
        System.out.println("Tổng tiền SP chênh lệch sau khuyến mãi : " + sumSale(products));
    }

    public static double sum(Product[] arr) {
        double sum = 0;
        for (Product i : arr) {
            sum += i.getPriceold();
        }
        return Math.round(sum);
    }

    public static double sale(Product[] arr) {
        double sum = 0;
        for (Product i : arr) {
            sum += i.getPricePro();
        }
        return Math.round(sum);
    }

    public static double sumSale(Product[] arr) {
        double sum = 0;
        for (Product i : arr) {
            sum += i.getPriceold() - i.getPricePro();
        }
        return Math.round(sum);
    }
}