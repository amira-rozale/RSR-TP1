//objectin objectout Q2
package s2resysrep;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.*;
//import java.util.Scanner;

public class ss {
private static String find(String s,String v){
	    int index = v.indexOf(s);
	    
	    if(index == - 1) {
	      System.out.println("Le mot "+s+" n'existe pas.");
	    } else {
	      System.out.println("Le mot :"+s+" se trouve à l'index : "+ index);
	    }
		return v;
	  }
	   public static void main(String args[]){
		//Scanner scanner= new Scanner (System.in);
	   try{int port=2222;
	
	ServerSocket serverSocket = new ServerSocket(port);  
	 
	System.out.println("Waiting for Client...");
	 
	//establish connection
	Socket socket = serverSocket.accept();
	 
	System.out.println("Client Connected...");
	 
	ObjectOutputStream output=new ObjectOutputStream (socket.getOutputStream());
	ObjectInputStream  input=new ObjectInputStream (socket.getInputStream());
	String message=(String)input.readObject();
	System.out.println("give the second string");
	String message1=(String)input.readObject();
	
	output.writeObject("message recu");
	
	//fetch incoming message
	//DataInputStream dis = new DataInputStream(socket.getInputStream());
	//String  message = (String)dis.readUTF();
	
	//DataInputStream dis1 = new DataInputStream(socket.getInputStream());
	//String  message1 = (String)dis1.readUTF();

	String index= find(message1,message);
	serverSocket.close();
	}catch(Exception e){
	e.printStackTrace();
	}
	}
}
