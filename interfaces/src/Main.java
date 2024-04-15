//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new EmailLogger(),new DatabaseLogger(), new FileLogger(), new SmsLogger()};
        Customer customer = new Customer(1,"Muhammet Taha","Adıyaman");
        CustomerManager customerManager = new CustomerManager(loggers);
        customerManager.add(customer);
    }
}