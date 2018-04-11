package PolyClient;

import javafx.scene.Node;

/**
 * Корневой суперкласс всех объектов
 * @author Антон Литвиненко
 * @version 0.1
 */
public class PObject {
    private PPoint position;
    private Node node;

    public PObject() {
        this.position = new PPoint();
    }

    public PObject(PPoint p) {
        this.position = p;
    }

    public PPoint getPosition() {
        return this.position;
    }

    public void setPosition(PPoint p) {
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
