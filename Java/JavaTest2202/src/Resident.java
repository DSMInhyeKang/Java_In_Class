public class Resident extends Person {
    public String bankAccount;
    Utensil utensil = new Utensil("인덕션", "싱크대");

    Resident(String name, String  sex, int age, String bankAccount) {
        super(name, sex, age);
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(String name, String sex, int age) {
        System.out.println(name + "(" + sex + ", " + age + ")(이)/가 " + bankAccount + "로 관리비를 납부하였습니다.");
    }

    void use() {
        System.out.println(utensil.sink);
    }
}
