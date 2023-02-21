package s2resysrep;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class c {
	
	public static void main(String args[]){
	String message,message1;
	Scanner sc = new Scanner(System.in);
	try{int port=1111;
	//localhost because server is running on local machine, otherwise use ip of server
	Socket socket = new Socket("localhost", port);
	 
	System.out.println("Connected with Server...");
	System.out.println("enter a message: ");
	message = sc.nextLine();
	 
	//sending the message
	DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
	dout.writeUTF(message);
	
	System.out.println("enter a message: ");
	message1 = sc.nextLine();
	 
	//sending the message2
	DataOutputStream dout1 = new DataOutputStream(socket.getOutputStream());
	dout1.writeUTF(message1);
	
	dout1.flush();
	dout.flush();
	dout.close();
	dout1.close();
	//close connection
	socket.close();  
	}catch(Exception e){
	e.printStackTrace();
	}
	}
	
}
