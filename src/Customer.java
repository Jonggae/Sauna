import java.util.Scanner;

public class Customer {

    // int money; //없어도 될듯
    int age;
    String gender;
    public int healthCondition ;
    Scanner sc = new Scanner(System.in);

    public void customerInfo() {
        System.out.println("당신의 성별은 무엇입니까? (남/여)");

        this.gender = sc.next();
        System.out.println("당신의 나이는 몇 살입니까? (숫자 입력)");
        this.age = sc.nextInt();
        System.out.println("당신의 현재 컨디션은 " + healthCondition + "점 입니다.");
    }

    public int getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(int healthCondition) {
    }

    public void increaseCondition (int recoveryCondition) {
        healthCondition += recoveryCondition;
    }
}

