public class Kitchen extends TheInside {
    Utensil utensil = new Utensil("인덕션", "싱크대");

    public Kitchen(String roomName) {
        super(roomName);
    }

    public void useKitchen() {
        System.out.println(roomName + "에서 " + utensil.inductionCooktop + "와(과) " + utensil.sink + "이(가) 사용 중입니다.");
    }
}
