public class Utensil {
    public String inductionCooktop;
    public String sink;

    public Utensil(String inductionCooktop, String sink) {
        this.inductionCooktop = inductionCooktop;
        this.sink = sink;
    }

    public void turnOnCooktop() {
        System.out.println(this.inductionCooktop + "을(를) 켰습니다.");
    }
    public void turnOnWater() {
        System.out.println(this.sink + "에서 물을 틀었습니다.");
    }
}
