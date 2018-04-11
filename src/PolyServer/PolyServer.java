package PolyServer;

import java.net.*;
import java.util.logging.*;

/**
 * Основной класс сервера
 * @author Антон Литвиненко
 * @version 0.1
 */
public class PolyServer extends Thread{
    private static final Logger LOGGER = Logger.getLogger( PolyServer.class.getName() );

    @Override
    public void run(){
        int serverPort = 8082;
        int sessionCount = 0;
        try {
            while (true) {
                sessionCount++;
                ServerSocket serverSocket = new ServerSocket(serverPort);
                ConnectionHandler connectionHandler = new ConnectionHandler();
                connectionHandler.connection = serverSocket.accept();
                connectionHandler.sessionId = sessionCount;
                connectionHandler.start();
                serverSocket.close();
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }
}
