package PolyClient;

import javafx.scene.Group;
import PolyClient.PObject.PObject;

/**
 * Отрисовка движения объекта
 * @author Антон Литвиненко
 * @version 0.2
 */
public class MoveHandler {
    private WorkSpaceFX wsfx;
    private Group root;

    public void moveTo(PObject pobject, int x, int y){
        root.getChildren().removeAll(pobject.getNode());
        wsfx.removePObject(pobject.getPosition().getPX(), pobject.getPosition().getPY(), 0);
        pobject.setPosition(x, y);
        wsfx.addPObject(pobject);
        root.getChildren().addAll(pobject.getNode());

        System.out.println(pobject.getClass() + ":" + pobject.getPosition().getPX() + ":" + pobject.getPosition().getPY() + " change to " + x + ":" + y);
    }

    public void setWorkSpaceFX(WorkSpaceFX wsfx){
        this.wsfx = wsfx;
    }
    public void setGroup(Group root) {
        this.root = root;
    }
}
