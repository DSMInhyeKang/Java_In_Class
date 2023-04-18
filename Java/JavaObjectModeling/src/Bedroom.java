public class Bedroom extends TheInside{
    public Bed bed = new Bed("Queen", "Black");

    public Bedroom (String roomName) {
        super(roomName);
    }

    public void useBedroom() {
        System.out.println(roomName + "에서 " + bed.bedColor + " 컬러의 " + bed.bedSize + " 사이즈 침대이(가) 사용 중입니다.");
    }
}

