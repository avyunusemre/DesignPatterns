package builder;

public class BuilderRun {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId(13L);
        product1.setName("Pc");
        product1.setInStock(false);

        System.out.println(product1.toString());

        Product product2 = new Product.ProductBuilder()
                .id(13L)
                .name("Pc")
                .inStock(false)
                .build();

        System.out.println(product2.toString());

    }
}
