package PolyClient.PObject;

import PolyClient.PolyClient.*;
import javafx.scene.Node;

/**
 * Корневой суперкласс всех объектов
 * @author Антон Литвиненко
 * @version 0.1
 */
public class PObject {
    private PolyClient.PPoint position;
    private Node node;

    public PObject() {
        this.position = new PolyClient.PPoint();
    }

    public PObject(PolyClient.PPoint p) {
        this.position = p;
    }

    public PolyClient.PPoint getPosition() {
        return this.position;
    }

    public void setPosition(PolyClient.PPoint p) {
        this.position = p;
    }

    public void setPosition(int x, int y) {
        this.position.setPX(x);
        this.position.setPY(y);
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node){
        this.node = node;
    }
}
