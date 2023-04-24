public class Person {
    String name, sex;
    int age;

    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void pay(String name) {
        System.out.println(name + "이(가) 관리비를 납부했습니다.");
    }
    public void pay(String name, String sex, int age) { //메소드 오버로딩 - 메소드 이름 동일, 매개 변수 타입, 갯수 다름
        System.out.println(name + "(" + sex + ", " + age + ")이(가) 관리비를 납부했습니다.");
    }
}
