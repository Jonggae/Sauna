public class Main {
    Customer customer;
    SaunaRooms saunaRooms;


    public static void main(String[] args) {

        Customer customer = new Customer();
        SaunaRooms saunaRooms = new SaunaRooms();

//        customer.customerInfo();
        customer.customerCondition();
        saunaRooms.choiceRoom();
    }
}