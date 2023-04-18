public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동", "남", 20);
        person.pay("홍길동");
        person.pay("홍길동", "남", 25);

        Resident resident = new Resident("홍길동", "남", 25, "농협 356-****-****-03");
        resident.pay("홍길동", "남", 25);
        resident.use();

        TheInside theInside = new TheInside("");
    }
}