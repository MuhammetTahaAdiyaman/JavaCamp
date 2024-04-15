public class CustomerManager {
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }
    //yukarıdaki tasarımı yapmamızın nedeni metotlarda erişimi sağlayabilmek.
    public void add(Customer customer){
        System.out.println("Müşteri eklendi: "+customer.getFirstName());

        Utils.runLoggers(loggers,customer.getFirstName());
    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi: "+customer.getFirstName());
        Utils.runLoggers(loggers,customer.getFirstName());
    }
}
