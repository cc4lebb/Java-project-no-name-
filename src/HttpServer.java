import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer{
    public static void main(String[] args) throws IOException {
        int port = 8080; // giving a port value for now to test

        ServerSocket serverSocket = new ServerSocket(port); // listening to port
        System.out.println("listening on port " + port);
        System.out.println("go to browser/ command line and run:\nhttp://localhost:8080");

            // constantly waiting for a request to be made on port number.
            while(true) {
                Socket clientSocket = serverSocket.accept(); // connect to port

                handleClient(clientSocket);
            }
    }

    private static void handleClient(Socket clientSocket){
        // read the request and send it back

        // variables for output and input
        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // input from client
        OutputStream output = clientSocket.getOutputStream(); // output to client

        // read the incoming HTTP request: GET request
    }
}