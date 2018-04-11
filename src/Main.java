import PolyClient.PolyClient;
import PolyServer.PolyServer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );

    public static void main(String[] args) {
        try {
            /* write your code here */
            //PolyServer polyServer = new PolyServer();
            //polyServer.start();

            PolyClient polyClient = new PolyClient();
            polyClient.start();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }
}
