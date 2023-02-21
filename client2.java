import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class cc {
	public static void main(String args[]){
		String message,message1;
		//Scanner sc = new Scanner(System.in);
		try{int port=2222;
		String host= "localhost";
		InetAddress adr=InetAddress.getByName(host);
		//localhost because server is running on local machine, otherwise use ip of server
		Socket socket = new Socket(adr, port);
		
		ObjectOutputStream output=new ObjectOutputStream (socket.getOutputStream());
		ObjectInputStream  input=new ObjectInputStream (socket.getInputStream());
		
		System.out.println("Connected with Server...");

		output.writeObject("send 1 message");
		 message=(String)input.readObject();
		output.writeObject("send 2 message");
		message1=(String)input.readObject();
	
		
		 
		//System.out.println("enter a message: ");
		//message = sc.nextLine();
		 
		//sending the message
		//DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
		//dout.writeUTF(message);
		
		//System.out.println("enter a message: ");
		//message1 = sc.nextLine();
		 
		//sending the message2
		//DataOutputStream dout1 = new DataOutputStream(socket.getOutputStream());
		//dout1.writeUTF(message1);
		
		//dout1.flush();
		//dout.flush();
		//dout.close();
		//dout1.close();
		//close connection
		socket.close();  
		}catch(Exception e){
		e.printStackTrace();
		}
		}
			
}
