public class Main {

    public static void main(String[] args) {
	    Product product = new Product();
        product.name = "Laptop";
        product.setId(1);
        product.description = "Asus";
        product.price = 1250;
        product.stockAmount = 500 ;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.name);
    }
}
