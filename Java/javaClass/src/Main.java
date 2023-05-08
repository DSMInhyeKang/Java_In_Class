import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        A2202 t = new A2202();
        System.out.println(t.run(new int[] {1,2,3,4,5}));

        System.out.println("숫자를 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(input);

        //인터페이스 구현 - 자동 타입 변환
        InterF interF = new InterFClass();

        InterF interF1 = new InterF() {
            @Override
            public void method() {
                System.out.println("익명 구현 객체");
            }
        };
    }
}