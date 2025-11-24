// wont be doing https (no encryption)

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer{
    public static void main(String[] args) throws IOException {
        int port = 8080; // giving a port value for now to test

        ServerSocket serverSocket = new ServerSocket(port); // listening to port
        System.out.println("listening on port" + port);

            // constantly waiting for a request to be made on port number.
            while(true) {
                Socket clientSocket = serverSocket.accept(); // connect to port

                // variables for output and input
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // input from client
                OutputStream output = clientSocket.getOutputStream(); // output to client

                FileReader file = new FileReader("index.html");

                // if file is read

                //else 404 not found

                // close client socket after the header is printed
                clientSocket.close();
                file.close();
            }

    }
}