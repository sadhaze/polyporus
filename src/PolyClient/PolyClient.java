package PolyClient;

import java.util.logging.*;

public class PolyClient extends Thread{
    private static final Logger LOGGER = Logger.getLogger( PolyClient.class.getName() );

    @Override
    public void run(){
        int serverPort = 8082;
        int sessionCount = 0;
        try {
            MainFrame mainFrame = new MainFrame();
            mainFrame.start();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }
}