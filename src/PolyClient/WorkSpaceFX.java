package PolyClient;

import PolyClient.PObject.*;
import javafx.scene.Group;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс содержащий фнформацию об объектах размещенных на локации
 * @author Антон Литвиненко
 * @version 0.3
 */
public class WorkSpaceFX {
    private List<List<List<PObject>>> workSpaceX;
    private List<List<PObject>> workSpaceY;
    private List<PObject> pObjects;

    public WorkSpaceFX() {
        workSpaceX = new ArrayList<>();
        for(int ix = 0; ix < VisualFeaturs.wswidth; ix++){
            workSpaceY = new ArrayList<>();
            for(int iy = 0; iy < VisualFeaturs.wsheight; iy++){
                pObjects = new ArrayList<>();
                workSpaceY.add(iy, pObjects);
            }
            workSpaceX.add(ix, workSpaceY);
        }
    }

    public void addPObject(PObject pObject){
        workSpaceX.get(pObject.getPosition().getPX()).get(pObject.getPosition().getPY()).add(pObject);
    }

    public void removePObject(int x, int y, int index){
        workSpaceX.get(x).get(y).remove(index);
    }

    public PObject getPObject(int xposition, int yposition, int index){
        return workSpaceX.get(xposition).get(yposition).get(index);
    }

    public int getPOWidth(){
        return workSpaceX.size();
    }
    public int getPOHeight(){
        return workSpaceY.size();
    }
    public int getPobCount(int xposition, int yposition){
        return workSpaceX.get(xposition).get(yposition).size();
    }
}
