public class InterfaceClass implements InterfaceExam {
    //인터페이스에 선언된 추상 메소드의 실체 메소드 선언
    InterfaceExam example = new InterfaceClass(); //자동 타입 변환

    @Override
    public void abstractMethod() {
        System.out.println("오버라이딩 된 추상 메소드");

        example.defaultMethod();
    }
}


