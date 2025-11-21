// wont be doing https (no encryption)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer{
    public static void main(String[] args) throws IOException {

        int port = 63342; // giving a port value for now to test
        ServerSocket serverSocket = new ServerSocket(port); // listening to port

            // constantly waiting for a request to be made on port number.
            while(true) {
                Socket clientSocket = serverSocket.accept();

                // output to client
                PrintWriter output = new PrintWriter(clientSocket.getInputStream(), true);

                // input from client
                BufferedReader input = new BufferedReader
                        (new InputStreamReader(clientSocket.getInputStream()));

            }
    }
}