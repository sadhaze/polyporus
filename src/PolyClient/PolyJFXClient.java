package PolyClient;

import PolyClient.PObject.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;

/**
 * Основная сцена
 * @author Антон Литвиненко
 * @version 0.1
 */
public class PolyJFXClient extends Application {
    public void launchApp() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        WorkSpaceFX wsfx = new WorkSpaceFX();
        Scene scene = new Scene(createPane(wsfx), VisualFeaturs.panelwidth, VisualFeaturs.panelheight);
        primaryStage.setTitle(VisualFeaturs.gamename);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Parent createPane(WorkSpaceFX wsfx) {
        Group root = new Group();
        wsfx.setMouseHandler(root);

        ObjFloor floor = null;
        ObjPlayer player = null;
        ObjCursor cursor = null;

        for (int ix = 0; ix < wsfx.getPOWidth(); ix++) {
            for (int iy = 0; iy < wsfx.getPOHeight(); iy++) {
                floor = new ObjFloor(ix, iy);
                wsfx.addPObject(floor);
            }
        }

        player = new ObjPlayer(0,0);
        wsfx.addPObject(player);

        cursor = new ObjCursor(0,0);
        wsfx.addPObject(cursor);
        wsfx.setCursor(cursor);

        for (int ix = 0; ix < wsfx.getPOWidth(); ix++) {
            for (int iy = 0; iy < wsfx.getPOHeight(); iy++) {
                for (int i = 0; i < wsfx.getPobCount(ix, iy); i++){
                    if (wsfx.getPObject(ix, iy, i).getNode() != null) root.getChildren().addAll(wsfx.getPObject(ix, iy, i).getNode());
                }
            }
        }

        return root;
    }
}
