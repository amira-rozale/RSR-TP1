//Q5
package multi;

import java.io.*;
import java.net.*;
import java.io.Serializable;
public class severMult extends Thread {

	
		    private int cp;
			private Socket socket;
			public static void main(String argv[]){
				try {
					int cp=0;
			ServerSocket serverSocket = new ServerSocket(1236);
			System.out.println("Serveur en attente");
			while (true) // est - il necessaire ?
			{Socket socketclient = serverSocket.accept();
			cp=cp+1;
			
			severMult t=new severMult (socketclient,cp);
			t.start();t.activeCount();}}
			catch (Exception e) {e.printStackTrace(); }}
			
			public severMult(Socket socket,int cp){
				this.socket=socket;
				this.cp=cp;}
			public void run(){
			try{
			ObjectOutputStream output =new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream input =new ObjectInputStream(socket.getInputStream());
			
			// attente les données venant du client
			  //lire les 2mots recus
	        String line =(String) input.readObject();
	        String line2 = (String)input.readObject();
	      
	        System.out.println(" message reçu du client est : "+line+ " et " +line2);
	         output.writeObject("Bienvenue, vous etes le client numero "+cp);
	        //verifier
	         
	        if (line.contains(line2)) {
	        	output.writeObject(line + " contient " + line2);
	        } else {
	          output.writeObject(line + " ne contient pas " + line2);
	        } }
			catch(Exception e) {
			System.err.println("Erreur :"+e);}}
			}

