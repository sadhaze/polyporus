package PolyClient;

import PolyClient.PObject.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;

/**
 * Обработчик событий мыши
 * @author Антон Литвиненко
 * @version 0.1
 */
public class MouseHandler {
	private ObjCursor cursor;
	
	public MouseHandler(WorkSpaceFX wsfx, Group root){
		EventHandler<MouseEvent> mouseClick = new EventHandler<MouseEvent>() { 
		   @Override 
		   public void handle(MouseEvent e) { 
		      System.out.println("Click!");  
		   } 
		};   
		root.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseClick);
		
		EventHandler<MouseEvent> mouseMove = new EventHandler<MouseEvent>() { 
			@Override
			public void handle(MouseEvent e) {
				if(cursor.getPosition().getPX() != (int)(e.getX() - e.getX() % VisualFeaturs.pobjectsize) / VisualFeaturs.pobjectsize
						|| cursor.getPosition().getPY() != (int)(e.getY() - e.getY() % VisualFeaturs.pobjectsize) / VisualFeaturs.pobjectsize){
			    	int x = (int)(e.getX() - e.getX() % VisualFeaturs.pobjectsize) / VisualFeaturs.pobjectsize;
					int y = (int)(e.getY() - e.getY() % VisualFeaturs.pobjectsize) / VisualFeaturs.pobjectsize;

					System.out.println(cursor.getPosition().getPX() + ":" + cursor.getPosition().getPY() + " change to " + x + ":" + y);
					root.getChildren().removeAll(cursor.getNode());
			    	wsfx.removePObject(cursor.getPosition().getPX(), cursor.getPosition().getPY(), 0);
			    	cursor.setPosition(x, y);
			    	wsfx.addPObject(cursor);
			    	root.getChildren().addAll(cursor.getNode());
				}
			}
		};
			root.addEventFilter(MouseEvent.MOUSE_MOVED, mouseMove);
	}
	
	public void setCursor(ObjCursor cursor){
		this.cursor = cursor;
	}
}
