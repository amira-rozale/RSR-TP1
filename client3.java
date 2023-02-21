package s2resysrep;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class ccc {

	
	public static void main(String args[]){
	String message;
	Scanner sc = new Scanner(System.in);
	try{int port=7779;
	//localhost because server is running on local machine, otherwise use ip of server
	Socket socket = new Socket("localhost", port);
	ObjectOutputStream output=new ObjectOutputStream (socket.getOutputStream());
	ObjectInputStream input=new ObjectInputStream (socket.getInputStream());
	System.out.println("Connected with Server...");
	System.out.println("enter a message: ");
	message = sc.nextLine();
	 output.writeObject(message);
	//sending the message
	//DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
	//dout.writeUTF(message);
	
	
	 
	
	
	
	//dout.flush();
	//dout.close();
	
	//close connection
	socket.close();  
	}catch(Exception e){
	e.printStackTrace();
	}
	}
	
}

