public class Sauna {
    public void choosePlace() {
        SaunaRooms sr = new SaunaRooms();
        System.out.println("(샤워를 하고 왔다) 어디부터 가볼까?");
        System.out.println("1. 로비 : TV와 안마의자 \n2. 사우나 : 컨디션 회복! \n3. 매점 : 맛있는 것을 판다");
        int selectedNum = Main.sc.nextInt();

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
    public void nextAction() {
        SaunaRooms sr = new SaunaRooms();
        System.out.println("다음은 무엇을 할까요?");
        System.out.println("1. 로비 : TV와 안마의자 \n2. 사우나 : 컨디션 회복! \n  3. 매점 : 맛있는 것을 판다");
        int selectedNum = Main.sc.nextInt();

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
        System.out.println("Tv를 보며 안마의자를 이용할 수 있습니다.");
        System.out.println("안마의자는 컨디션이 초당 0.5씩 회복됩니다.");
        nextAction();
    }

    public void shop() {
        System.out.println("안녕하세요. 시원한 음료 한잔하세요!!");
        System.out.println("1. 식혜  2. 우유  3. 아이스커피");
        nextAction();
    }

    public void massageChair() {
        //입력받은 사용시간을 기준으로 컨디션을 회복시킴

    }
}
