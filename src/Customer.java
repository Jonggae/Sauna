import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    private int healthCondition;

    // 생성자
    public Customer() {

    }

    //getter
    public int getHealthCondition() {
        return healthCondition;
    }

    //setter
    public void setHealthCondition(int healthCondition) {
        this.healthCondition = healthCondition;
    }


    public void customerInfo() {
        System.out.println("당신의 성별은 무엇입니까? (남/여)");
        String gender = sc.next();
        // 예외처리 하기_ "남","여" 입력외에는 재입력
        System.out.println("당신의 나이는 몇 살입니까? (숫자 입력)");
        int age = sc.nextInt();
        // 예외처리 하기 _ 숫자 외에는 재입력 (수치 제한은?)

        if (gender.equals("남")) {
            System.out.println("남성은 왼쪽으로 들어가세요.");
        } else {
            System.out.println("여성은 오른쪽으로 들어가세요.");
        }
        System.out.println(age + " 살은 입장료 3000원 입니다.");

        customerCondition();
    }

    public void customerCondition() {

        System.out.println("#컨디션수치입력? (0 ~ 100점)");
        int inputCon = sc.nextInt();

        System.out.println("당신의 현재 컨디션은 " + inputCon + "점 입니다.");
        healthCondition = inputCon;
        System.out.println(getHealthCondition());
        // 예외처리 하기 _ 범위 밖 숫자는 재입력
    }

    public void increaseCondition(int recoveryCondition) {
        healthCondition += recoveryCondition;
    }
}


