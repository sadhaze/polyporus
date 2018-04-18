package PolyClient.PObject;

import PolyClient.PolyClient.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

/**
 * Объект курсор
 * @author Антон Литвиненко
 * @version 0.1
 */
public class ObjCursor extends PObject {
    private Rectangle cursor;

    public ObjCursor(int x, int y) {
        super.setPosition(x, y);

        cursor = new Rectangle();
        cursor.setX(x * PolyClient.VisualFeaturs.pobjectsize);
        cursor.setY(y * PolyClient.VisualFeaturs.pobjectsize);
        cursor.setHeight(PolyClient.VisualFeaturs.pobjectsize);
        cursor.setWidth(PolyClient.VisualFeaturs.pobjectsize);
        cursor.setFill(Color.TRANSPARENT);
        cursor.setStroke(Color.BLUE);
        cursor.setStrokeType(StrokeType.INSIDE);
        cursor.setStrokeWidth(PolyClient.VisualFeaturs.gridsize/20);
        setNode(cursor);
    }

    public void setPosition(int x, int y) {
        super.setPosition(x, y);
        cursor.setX(x * PolyClient.VisualFeaturs.pobjectsize);
        cursor.setY(y * PolyClient.VisualFeaturs.pobjectsize);
    }
}
