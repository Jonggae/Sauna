import java.util.Scanner;

//현재 사용하지 않음.
public class Entrance {

    String gender;
    int age;

    Scanner sc = new Scanner(System.in);

    public void entrance() {
        System.out.println("어서오세요. 사우나입니다.");
    }

    public void checkGender() {
        System.out.println("성별을 입력해주세요.(남 / 여)");
        System.out.print(">>> ");
        this.gender = sc.next();
    }

    public void checkAge() {
        System.out.println("나이를 입력해주세요.");
        System.out.println(">>> ");
        this.age = sc.nextInt();

    }

    public void enterCustomer() {
        if (gender.equals("남")) {
            System.out.println("남탕으로 들어갑니다. 안에서 결제를 진행해주세요.");
        } else if (gender.equals("여")) {
            System.out.println("여탕으로 들어갑니다. 안에서 결제를 진행해주세요.");
        } else {
            System.out.println("다시 입력하세요");
            checkGender();
        }

        if (11<age && age <20) { // && : 둘다 true여야 true
            System.out.println("남탕으로 들어갑니다. 안에서 결제를 진행해주세요.");

        }

    }


}
