public class Furniture {
    String tv, sofa;

    public Furniture(String tv, String sofa) {
        this.tv = tv;
        this.sofa = sofa;
    }

    public void turnOnTv() {
        System.out.println(tv + "이(가) 켜졌습니다.");
    }
    public void sitOnSofa() {
        System.out.println(sofa + "에 앉았습니다.");
    }
}
