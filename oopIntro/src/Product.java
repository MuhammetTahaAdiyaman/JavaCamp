//burada bir şablon oluşturuyoruz.
public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;
    //private sadece bu class içinde kullanıma açık yani erişim sağlayabiliriz anlamına gelmektedir. Bundan dolayı biz getter ve setter methodları oluşturduk.
    //final sadece constructor da set edilebilir anlamına gelmektedir.
    //bu blokun adı constructor. newlediğimiz anda çalışmasını istediğimiz şeyler burada yazılır.
    public Product(){

    }
    public Product(int id,String name,double unitPrice, String detail, double  discount){
        this(); //parametresiz constructor çalıştır demektir.
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice-(this.unitPrice*this.discount/100);
    }

}
