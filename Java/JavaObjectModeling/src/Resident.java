public class Resident extends Person {
    String bankAccount;
    Resident(String name, String sex, int age, String bankAccount) {
        super(name, sex, age);
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(String name, String sex, int age) { //메소드 오버라이딩 - 부모와 시그니처(리턴 타입, 메소드 이름, 매개변수 리스트) 같음
        System.out.println(name + "(" + sex + ", " + age + ")이(가) " + bankAccount + "으로 관리비를 납부했습니다.");
    }

    void use() {
        Kitchen kitchen = new Kitchen("부엌");
        kitchen.useKitchen();
        Utensil utensil = new Utensil("인덕션", "싱크대");
        utensil.turnOnCooktop();
        utensil.turnOnWater();

        Bedroom bedroom = new Bedroom("침실", 1);
        bedroom.useBedroom();
        Bed bed = new Bed("Queen", "Black");
        bed.lieOnTheBed();

        LivingRoom livingRoom = new LivingRoom("거실", "Ivory");
        livingRoom.useLivingRoom();
        Furniture furniture = new Furniture("티비", "소파");
        furniture.turnOnTv();
        furniture.sitOnSofa();
    }
}