import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {

    // int money; //없어도 될듯
    int age;
    String gender;
    private int healthCondition;
    Scanner sc = new Scanner(System.in);


    public void customerInfo() {
        customerGender();
        customerAge();
        customerCondition();
    }

    public void customerGender() {
        System.out.println("당신의 성별은 무엇입니까? (남/여)");
        this.gender = sc.next();
        // 예외처리 하기
    }

    public void customerAge() {
        System.out.println("당신의 나이는 몇 살입니까? (숫자 입력)");
        this.age = sc.nextInt();
        // 예외처리 하기
    }

    private void customerCondition() {
        System.out.println("몸상태는 어때요? (0~100점)");
        this.healthCondition = sc.nextInt();
        System.out.println("당신의 현재 컨디션은 " + healthCondition + "점 입니다.");
        // 예외처리 하기
    }

    public int getHealthCondition() {
        return this.healthCondition;
    }

    public void setHealthCondition(int healthCondition) {
    }

    public int increaseCondition(int recoveryCondition) {
        this.healthCondition += recoveryCondition;
        return recoveryCondition;
    }
}


