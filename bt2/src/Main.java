public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("P1", "Áo",1000,2,10);
        Product product2 = new Product("P2", "Quần",1500,2,15);
        Product product3 = new Product("P3", "Giày",2000,1,20);
        Product product4 = new Product("P4", "khăn",300,1,10);
        Product product5 = new Product("P5", "mũ",500,1,10);
        double[][] arr = {{product1.getPriceold(), product1.getPricePro()},
                          {product2.getPriceold(), product2.getPricePro()},
                          {product3.getPriceold(), product3.getPricePro()},
                          {product4.getPriceold(), product4.getPricePro()},
                          {product5.getPriceold(), product5.getPricePro()}};

        System.out.println("Tổng sau khuyến mại là: " + sumArr1(arr));
        System.out.println("Chênh lệch trước và sau sau khuyến mại là: " + (sumArr2(arr)-sumArr1(arr)));
    }
    public static double sumArr1 (double[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][1];
        }
        return sum;
    }
    public static double sumArr2 (double[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][0];
        }
        return sum;
    }
}