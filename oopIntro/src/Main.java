//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",0); //referans oluşturma, instance oluşturma


        Product product2 = new Product(); //referans oluşturma, instance oluşturma
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setUnitPrice(16000);
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);

        System.out.println(product1.getUnitPriceAfterDiscount());

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Yiyecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("İçecek");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

    }
}