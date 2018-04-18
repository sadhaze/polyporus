package PolyClient.PObject;

import PolyClient.PolyClient.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Объект пол
 * @author Антон Литвиненко
 * @version 0.1
 */
public class ObjFloor extends PObject {
    private Rectangle floor;

    public ObjFloor(int x, int y) {
        super.setPosition(x, y);

        floor = new Rectangle();
        floor.setX(x * PolyClient.VisualFeaturs.pobjectsize);
        floor.setY(y * PolyClient.VisualFeaturs.pobjectsize);
        floor.setHeight(PolyClient.VisualFeaturs.pobjectsize);
        floor.setWidth(PolyClient.VisualFeaturs.pobjectsize);
        floor.setFill(Color.GRAY);
        setNode(floor);
    }

    public void setPosition(int x, int y) {
        super.setPosition(x, y);
        floor.setX(x * PolyClient.VisualFeaturs.pobjectsize);
        floor.setY(y * PolyClient.VisualFeaturs.pobjectsize);
    }
}
