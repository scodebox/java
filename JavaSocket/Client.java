import java.io.*;
import java.net.*;
class Client{
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 1234);
		System.out.println("Connected to the local host");
		PrintWriter toServer = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number : ");
		String n = fromUser.readLine();
		toServer.println(n);
		System.out.println("Sent to the server : " + n);
		n = fromServer.readLine();
		System.out.println("Answer : " + n);
		socket.close();
	}
}