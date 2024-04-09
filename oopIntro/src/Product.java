//burada bir şablon oluşturuyoruz.
public class Product {

    //bu blokun adı constructor. newlediğimiz anda çalışmasını istediğimiz şeyler burada yazılır.
    public Product(){
        System.out.println("Ben çalıştım");
    }

    public Product(int id,String name,double unitPrice, String detail){
        this(); //parametresiz constructor çalıştır demektir.
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }
    int id;
    String name;
    double unitPrice;
    String detail;

}
