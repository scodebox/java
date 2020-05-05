import java.io.*;
import java.net.*;

class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket serversocket = new ServerSocket(1234);
		System.out.println("Server listening at 1234...");
		
		while(true){
			Socket socket = serversocket.accept();
			System.out.println("request accepted.");
			BufferedReader fromClinet = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter toClient = new PrintWriter(socket.getOutputStream(), true);
			int n = Integer.parseInt(fromClinet.readLine());
			System.out.println("Received from client : " + n);
			int fact =1;
			for(int i=n; i > 1; i--)
				fact*=i;
			toClient.println(fact);
			System.out.println("sent data to client : " + fact);
		}
	}
}
