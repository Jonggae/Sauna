import java.util.Scanner;

public class Sauna {
    Scanner sc = new Scanner(System.in);

    public void choosePlace() {
        SaunaRooms sr = new SaunaRooms();
        System.out.println("어디로 갈까요?");
        System.out.println("1. 로비  2. 사우나  3. 매점");
        int selectedNum = sc.nextInt();

        switch (selectedNum) {
            case 1 -> lobby();
            case 2 -> sr.choiceRoom();
            case 3 -> shop();
            default -> {
                System.out.println("다시 입력하세요");
                choosePlace();
            }
        }
    }

    public void lobby() {
        System.out.println("이곳은 로비 입니다. 매점과 사우나가 있습니다.");
    }

    public void shop() {
        System.out.println("안녕하세요. 원하는 음료를 고르세요");
    }


}
