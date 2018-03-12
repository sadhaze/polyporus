import PolyClient.PolyClient;
import PolyServer.PolyServer;

public class Main {

    public static void main(String[] args) {
        /* write your code here */
        PolyServer polyServer = new PolyServer();
        polyServer.start();

        PolyClient polyClient = new PolyClient();
        polyClient.start();
    }
}
