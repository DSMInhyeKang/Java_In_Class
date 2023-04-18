public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동", "여", 20);
        person.pay("홍길동");
        person.pay("홍길동", "여", 20); //메소드 오버로딩

        Resident resident = new Resident("홍길동", "여", 20, "농협 356-****-****-03");
        resident.pay("홍길동", "여", 20); //메소드 오버라이딩
    }
}