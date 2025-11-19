// wont be doing https (no encryption)

import java.io.IOException;
import java.net.ServerSocket;

public class HttpServer{
    public static void main(String[] args) throws IOException {

        int port = 63342; // giving a port value for now to test
        ServerSocket socket = new ServerSocket(port); // listening to port


        // constantly waiting for a request to be made on port number.
        while(true){

        }

    }
}