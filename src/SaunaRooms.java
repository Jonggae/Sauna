public class SaunaRooms {

    String hotRoom;
    String warmRoom;
    String coldRoom;


    public void hotRoom() {
        Customer customer = new Customer();
        System.out.println("뜨거운 온도의 찜질공간입니다. 입장시 컨디션이 20 회복됩니다.");
        customer.healthCondition += 20;

        System.out.println("뜨거운 방을 이용했습니다. 당신이 현재 컨디션은 " + customer.healthCondition +" 입니다.");
    }
}
