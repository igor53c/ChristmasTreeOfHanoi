import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Move> list = ChristmasTreeOfHanoi
                .christmasTreeOfHanoi(
                        5,
                        "sourceTreeStand",
                        "destinationTreeStand",
                        "auxiliaryTreeStand"
                );

        for (Move element : list) {
            System.out.println(element.toString());
        }
    }
}