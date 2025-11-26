import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer{
    public static void main(String[] args) throws IOException {
        int port = 8080;

        ServerSocket serverSocket = new ServerSocket(port); // listening to port
        System.out.println("listening on port " + port);
        System.out.println("go to browser/ command line and run:\nhttp://localhost:8080");

            // constantly waiting for a request to be made on port number.
            while(true) {
                Socket clientSocket = serverSocket.accept(); // connect to port

                handleClient(clientSocket);
                clientSocket.close();
            }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        // read the request and send it back

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // input from client
        OutputStream output = clientSocket.getOutputStream(); // output to client

        // read the incoming HTTP request
        String requestHeader;
        while((requestHeader = input.readLine()) != null){ // assigns requestHeader var to the input and checks if its not null
            System.out.println(requestHeader);
            if(requestHeader.isEmpty()){
                break;
            }
        }

        // HTTP response 
        String okResponse =
                "HTTP/1.1 200 OK\r\nContent-Type: text/plain\r\n\r\nUser data here";

        byte[] data = okResponse.getBytes("UTF-8"); //encodes bytes back into string

        // this is written to command line when curled
        output.write(data);
        output.flush();

    }
}