import java.util.Scanner;

public class SaunaRooms {
    Customer customer = new Customer();
    public Scanner sc = new Scanner(System.in);

    public void customerCondition() {
        System.out.println("#컨디션수치입력? (0 ~ 100점)");
        int inputCon = sc.nextInt();

        System.out.println("당신의 현재 컨디션은 " + inputCon + "점 입니다.");
        customer.setHealthCondition(inputCon);
        // 예외처리 하기 _ 범위 밖 숫자는 재입력
    }

    public void choiceRoom() {
        System.out.println("어떤 방으로 들어갈까요?");
        System.out.println("1. 뜨거운 곳   2. 따뜻한 곳   3. 추운 곳");
        String selectedRoom = sc.next();
        switch (selectedRoom) {
            case "1" -> enterRoom("뜨거운", 10);
            case "2" -> enterRoom("따뜻한", 5);
            case "3" -> enterRoom("차가운", 5);
            default -> {
                System.out.println("다시 입력하세요");
                choiceRoom();
            }
        }
    }

    public void exitRoom() {
        System.out.println("나가시겠습니까? 한번 더 이용할 수 있습니다.");
        System.out.println("1.나가기   2. 한번 더 이용하기");
        String selectedRoom = sc.next();
        switch (selectedRoom) {
            case "1", "2" -> choiceRoom();
            default -> {
            }
        }
        choiceRoom();
    }

    public void enterRoom(String roomType, int recoveryCondition) {
        System.out.println(roomType + " 온도의 찜질공간 입니다. 입장시 컨디션이 " + recoveryCondition + " 회복됩니다.");
        customer.increaseCondition(customer.getHealthCondition(), recoveryCondition);         // increaseCondition 메서드가 있어야 컨디션 값이 누적됨

        System.out.println(roomType + " 방을 이용했습니다. 당신의 현재 컨디션은 " + customer.getHealthCondition() + " 입니다.");
        System.out.println("이용이 끝났습니다.");
        choiceRoom();
    }
}

