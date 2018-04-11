package PolyClient;

import java.util.logging.*;

/**
 * Основной класс клиента
 * @author Антон Литвиненко
 * @version 0.1
 */
public class PolyClient extends Thread{
    private static final Logger LOGGER = Logger.getLogger( PolyClient.class.getName() );

    @Override
    public void run(){
        //int serverPort = 8082;
        //int sessionCount = 0;
        try {
            PolyJFXClient mainApp = new PolyJFXClient();
            mainApp.launchApp();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }
}