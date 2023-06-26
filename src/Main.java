import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Customer customer = new Customer();
        SaunaRooms saunaRooms = new SaunaRooms();

//        customer.customerInfo();
        saunaRooms.customerCondition();
        saunaRooms.choiceRoom();
    }
}