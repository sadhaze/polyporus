package PolyClient;

import PolyClient.PObject.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;

import static java.lang.Thread.sleep;

/**
 * Обработчик событий мыши
 * @author Антон Литвиненко
 * @version 0.3
 */
public class MouseHandler {
	private Group root;
	private MoveHandler mover = new MoveHandler();
	private ObjCursor cursor;
	private ObjPlayer player;
	private WorkSpaceFX wsfx;

	public void startHandle(){
		EventHandler<MouseEvent> mouseClick = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if(!checkMousePosition((int) e.getX(), (int) e.getY())){
					mover.moveTo(player, PPoint.convertToPX((int) e.getX()), PPoint.convertToPY((int) e.getY()));
				}
				System.out.println("Click!" );
			}
		};
		root.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseClick);

		EventHandler<MouseEvent> mouseMove = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if(checkMousePosition((int) e.getX(), (int) e.getY())){
					mover.moveTo(cursor, PPoint.convertToPX((int) e.getX()), PPoint.convertToPY((int) e.getY()));
				}
			}
		};
		root.addEventFilter(MouseEvent.MOUSE_MOVED, mouseMove);
	}
	public void setCursor(ObjCursor cursor){
		this.cursor = cursor;
	}
	public void setPlayer(ObjPlayer player) {
		this.player = player;
	}
	public void setWorkSpaceFX(WorkSpaceFX wsfx){
		this.wsfx = wsfx;
		mover.setWorkSpaceFX(wsfx);
	}
	public void setGroup(Group root) {
		this.root = root;
		mover.setGroup(root);
	}
	public boolean checkMousePosition(int x, int y){
		if(cursor.getPosition().getPX() != PPoint.convertToPX(x) || cursor.getPosition().getPY() != PPoint.convertToPY(y)){
			return true;
		} else {
			return false;
		}
	}
}
