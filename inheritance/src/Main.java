//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IndividualCustomer individualCustomer = new IndividualCustomer();
        CorporateCustomer corporateCustomer = new CorporateCustomer();

        individualCustomer.customerNumber = "1234";
        corporateCustomer.customerNumber = "78910";
        //superclass lar onu extend eden sınıfların referansını tutabilir.

        CustomerManager customerManager = new CustomerManager();
//        customerManager.add(individualCustomer);
//        customerManager.add(corporateCustomer);

        SendikaCustomer sendikaCustomer = new SendikaCustomer();
        sendikaCustomer.customerNumber = "99999";
//        customerManager.add(sendikaCustomer);

        Customer[] customers = {individualCustomer,corporateCustomer,sendikaCustomer};
        customerManager.addMultiple(customers);
    }
}