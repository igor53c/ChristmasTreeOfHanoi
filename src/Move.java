public class Move {

    int treeLayers;
    String fromTreeStand;
    String toTreeStand;

    public Move(int treeLayers, String fromTreeStand, String toTreeStand) {
        this.treeLayers = treeLayers;
        this.fromTreeStand = fromTreeStand;
        this.toTreeStand = toTreeStand;
    }

    @Override
    public String toString() {
        return "Move (" + treeLayers + ", " + fromTreeStand + ", " + toTreeStand + ")";
    }
}
