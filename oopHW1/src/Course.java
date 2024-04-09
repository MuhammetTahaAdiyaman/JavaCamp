public class Course {

    private int id;
    private String name;
    private String detail;
    private int unitPrice;

    public Course(int id, String name, String detail, int unitPrice){
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.unitPrice = unitPrice;
    }

    public Course(){

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
