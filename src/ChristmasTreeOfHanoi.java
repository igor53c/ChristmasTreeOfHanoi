import java.util.List;
import java.util.ArrayList;

public class ChristmasTreeOfHanoi {
    public static List<Move> christmasTreeOfHanoi(
            int treeLayers,
            String sourceTreeStand,
            String destinationTreeStand,
            String auxiliaryTreeStand)
    {
        List<Move> retValue = new ArrayList<>();

        if(treeLayers > 1)
            retValue.addAll(
                    christmasTreeOfHanoi((treeLayers - 1), sourceTreeStand, auxiliaryTreeStand, destinationTreeStand)
            );

        retValue.add(new Move(treeLayers, sourceTreeStand, destinationTreeStand));

        if(treeLayers > 1)
            retValue.addAll(
                    christmasTreeOfHanoi((treeLayers - 1), auxiliaryTreeStand, destinationTreeStand, sourceTreeStand)
            );


        return retValue;
    }
}
