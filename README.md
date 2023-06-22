# Sauna
myproject
---

2023.06.22.

Beverage 클래스는 아직 사용하지 않음.

Entrance 클래스는 삭제 예정

Customer 클래스내의 customerInfo 메서드는 

    public void customerInfo() {
        customerGender();
        customerAge();
        customerCondition();
    }
    
3개의 메서드를 합쳐놓은 것임. 사실 하나의 메서드로 전부 만드려했으나
예외처리가 복잡하여 3개로 나눈 뒤 customerInfo()로 묶어놓음. 나중에 하나의 메서드로 변경가능

---
# 오류들
Customer 클레스의 cumstomerCondition()으로 healthCondition 값을 입력받았으나,

SaunaRooms 클래스의 enterRoom() 메서드에 입력받은 값으로 들어가지 않고있음. (자꾸 0으로 들어감)

healthCondition 필드는 계속해서 변경이 되어야 하는 값이므로, static으로 선언함

-> 우선은 해결되었으나.. 이게 맞는것인가?







