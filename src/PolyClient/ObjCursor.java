package PolyClient;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

public class ObjCursor extends PObject {
    private Rectangle cursor;

    public ObjCursor(int x, int y) {
        super.setPosition(x, y);

        cursor = new Rectangle();
        cursor.setX(x * VisualFeaturs.pobjectsize);
        cursor.setY(y * VisualFeaturs.pobjectsize);
        cursor.setHeight(VisualFeaturs.pobjectsize);
        cursor.setWidth(VisualFeaturs.pobjectsize);
        cursor.setFill(Color.TRANSPARENT);
        cursor.setStroke(Color.BLUE);
        cursor.setStrokeType(StrokeType.INSIDE);
        cursor.setStrokeWidth(VisualFeaturs.gridsize/20);
        setNode(cursor);
    }

    public void setPosition(int x, int y) {
        super.setPosition(x, y);
        cursor.setX(x * VisualFeaturs.pobjectsize);
        cursor.setY(y * VisualFeaturs.pobjectsize);
    }
}
