public class Person {
    public String name;
    public String sex;
    public int age;

    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void pay(String name) {
        System.out.println(name + "(이)/가 관리비를 납부하였습니다.");
    }

    public void pay(String name, String sex, int age) {
        System.out.println(name + "(" + age + "세, " + sex + ")" +"(이)/가 관리비를 지불했습니다.");
    }
}
