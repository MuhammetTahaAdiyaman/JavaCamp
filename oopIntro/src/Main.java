//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram"); //referans oluşturma, instance oluşturma


        Product product2 = new Product(); //referans oluşturma, instance oluşturma
        product2.id = 2;
        product2.name = "Lenovo V15";
        product2.unitPrice = 17000;
        product2.detail = "8 GB Ram";

        Product product3 = new Product(); //referans oluşturma, instance oluşturma
        product3.id = 3;
        product3.name = "Hp Omen 15";
        product3.unitPrice = 16000;
        product3.detail = "24 GB Ram";

        Product[] products = {product1,product2,product3};

        for(Product product:products){
            System.out.println(product.name);
        }
        System.out.println(products.length);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev/Bahçe";

        ProductManager productManager = new ProductManager();
        productManager.addToCard(product1);
        productManager.addToCard(product2);
        productManager.addToCard(product3);
    }
}