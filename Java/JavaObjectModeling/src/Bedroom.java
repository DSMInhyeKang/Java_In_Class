public class Bedroom extends TheInside{
    public Bed bed = new Bed("Queen", "Black");
    public int bedCount;

    public Bedroom (String roomName, int bedCount) {
        super(roomName);
        this.bedCount = bedCount;
    }

    public void useBedroom() {
        System.out.println(roomName + "에서 " + bed.bedColor + " 컬러의 " + bed.bedSize + " 사이즈 침대 " + bedCount + " 개가 사용 중입니다.");
    }
}

