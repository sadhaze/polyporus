package PolyClient;

/**
 * Основной класс точка, описывает положение объекта на локации
 * @author Антон Литвиненко
 * @version 0.1
 */
public class PPoint {
    private int x;
    private int y;

    public PPoint() {
        this.x = 0;
        this.y = 0;
    }

    public PPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int convertToPX(double x) {
        return (int)(x - x%VisualFeaturs.pobjectsize)/VisualFeaturs.pobjectsize;
    }

    public static int convertToPY(double y) {
        return (int)(y - y%VisualFeaturs.pobjectsize)/VisualFeaturs.pobjectsize;
    }

    public int getPX() {
        return this.x;
    }

    public int getPY() {
        return this.y;
    }

    public void setPX(int x) {
        this.x = x;
    }

    public void setPY(int y) {
        this.y = y;
    }
}
