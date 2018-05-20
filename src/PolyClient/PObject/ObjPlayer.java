package PolyClient.PObject;

import PolyClient.PolyClient.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Объект игрок
 * @author Антон Литвиненко
 * @version 0.1
 */
public class ObjPlayer extends PObject {
    private Circle player;

    public ObjPlayer(int x, int y) {
        super.setPosition(x, y);

        player = new Circle();
        player.setCenterX(x * PolyClient.VisualFeaturs.pobjectsize + PolyClient.VisualFeaturs.pobjectsize/2);
        player.setCenterY(y * PolyClient.VisualFeaturs.pobjectsize + PolyClient.VisualFeaturs.pobjectsize/2);
        player.setRadius(PolyClient.VisualFeaturs.gridsize/2);
        player.setFill(Color.RED);
        setNode(player);
    }

    public void setPosition(int x, int y) {
        super.setPosition(x, y);
        player.setCenterX(x * PolyClient.VisualFeaturs.pobjectsize + PolyClient.VisualFeaturs.pobjectsize/2);
        player.setCenterY(y * PolyClient.VisualFeaturs.pobjectsize + PolyClient.VisualFeaturs.pobjectsize/2);
    }
}
