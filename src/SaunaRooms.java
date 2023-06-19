import java.util.Scanner;

public class SaunaRooms {

    Customer customer = new Customer();


    Scanner sc = new Scanner(System.in);

    public void choiceRoom() {
        Customer customer = new Customer();
        System.out.println("어떤 방으로 들어갈까요?");
        System.out.println("1. 뜨거~   2. 따뜻~   3. 추워~");
        String selectedRoom = sc.next();
        switch (selectedRoom) {
            case "1" -> enterHotRoom(customer);
            case "2" -> enterWarmRoom(customer);
            case "3" -> enterColdRoom(customer);
            default -> {
                System.out.println("다시 입력하세요");
                choiceRoom();
            }
        }
    }

    public void exitRoom() {
        System.out.println("나가시겠습니까? 한번 더 이용할 수 있습니다.");
        System.out.println("1. 로비로 나가기   2. 한번 더 이용하기");
        String selectedRoom = sc.next();
        switch (selectedRoom) {
            case "1", "2" -> choiceRoom();
            default -> {}
        }
        choiceRoom();


    }

    public void enterHotRoom(Customer customer) {
        System.out.println("뜨거운 온도의 찜질공간입니다. 입장시 컨디션이 20 회복됩니다.");
        customer.healthCondition += 20;
        System.out.println("뜨거운 방을 이용했습니다. 당신이 현재 컨디션은 " + customer.healthCondition + " 입니다.");
    }

    public void enterWarmRoom(Customer customer) {
        System.out.println("적당한 온도의 찜질공간입니다. 입장시 컨디션이 30 회복됩니다.");
        customer.healthCondition += 30;
        System.out.println("적당한 방을 이용했습니다. 당신이 현재 컨디션은 " + customer.healthCondition + " 입니다.");
    }

    public void enterColdRoom(Customer customer) {
        System.out.println("시원한 온도의 찜질공간입니다. 입장시 컨디션이 20 회복됩니다.");
        customer.healthCondition += 20;
        System.out.println("시원한 방을 이용했습니다. 당신이 현재 컨디션은 " + customer.healthCondition + " 입니다.");
    }
}
