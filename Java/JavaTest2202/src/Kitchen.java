public class Kitchen extends TheInside {
    Utensil utensil = new Utensil("dfd","df");

    Kitchen(String roomName) {
        super(roomName);
    }

    public void useUtensil() {
        System.out.println(utensil.sink);
    }
}
