package s2resysrep;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class cccc {
	public static void main(String args[]){
		String message;
		Scanner sc = new Scanner(System.in);
		try{int port=7779;
		//localhost because server is running on local machine, otherwise use ip of server
		Socket socket = new Socket("localhost", port);
		ObjectOutputStream output1=new ObjectOutputStream (socket.getOutputStream());
		ObjectInputStream input1=new ObjectInputStream (socket.getInputStream());
		System.out.println("Connected with Server...");
		System.out.println("enter a message: ");
		message = sc.nextLine();
		 output1.writeObject(message);
		
		//dout.close();
		
		//close connection
		socket.close();  
		}catch(Exception e){
		e.printStackTrace();
		}
		}	
}
