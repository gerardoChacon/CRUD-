public class ChacNode {
    int productKey;
    String productDescription;
    float productPrice;
    int productStock;
    ChacNode nextProduct;

    public ChacNode(int productKey, String productDescription, float productPrice, int productStock) {
        this.productKey = productKey;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.nextProduct = null;
    }

    @Override
    public String toString() {
        return "[" +
                productKey + ", " +
                productDescription + ", $" +
                productPrice + ", " +
                productStock +
                "]";
    }
}