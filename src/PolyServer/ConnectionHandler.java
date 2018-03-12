package PolyServer;

import java.io.*;
import java.net.*;
import java.util.logging.*;


class ConnectionHandler extends Thread{
    private static final Logger LOGGER = Logger.getLogger( ConnectionHandler.class.getName() );

    public Socket connection = null;
    int sessionId;

    @Override
    public void run() {
        try {
            Writer serverWriter = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            serverWriter.write("hello, " + serverReader.readLine() + "\n" + sessionId + "\n");
            serverWriter.flush();
            System.out.println("Test");
            connection.close();
        } catch (Exception e){
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }
}