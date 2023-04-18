public class LivingRoom extends TheInside {
    Furniture furniture = new Furniture("티비", "소파");
    String carpetColor;

    public LivingRoom(String roomName, String carpetColor) {
        super(roomName);
        this.carpetColor = carpetColor;
    }

    public void useLivingRoom() {
        System.out.println(roomName + "의 카펫 색상은 " + carpetColor + " 입니다.");
        System.out.println(roomName + "에서 " + furniture.tv + "와(과) " + furniture.sofa + "이(가) 사용 중입니다.");
    }
}
