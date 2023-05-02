public interface InterfaceExam {
    //상수 - 선언과 동시에 초기화
    int constVal = 0;

    //메소드 - 추상, 디폴트, 정적 메소드
    void  abstractMethod(); //추상
    default void defaultMethod() { //디폴트
        System.out.println("디폴트 메소드");
    }
    static void staticMethod() { //정적
        System.out.println("정적 메소드");
    }
}



