package s2resysrep;
import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class sss extends Thread{

	private Socket socket;
	public static void main(String args[]){
	try {ServerSocket  serverSocket=new ServerSocket(7779);
	while(true) {Socket socketclient=serverSocket.accept();
	sss t= new sss(socketclient);
	t.start();
}	
}
	catch(Exception e) {e.printStackTrace();
	}
}
public sss(Socket socket) {
	this.socket=socket;
}
public void run() {
	try {
		ObjectOutputStream output=new ObjectOutputStream (socket.getOutputStream());
		ObjectInputStream input=new ObjectInputStream (socket.getInputStream());
		
		String chaine=(String)input.readObject();
		System.out.println("message recu:"+chaine);
	}
	catch(Exception e) {System.err.println("erreur:"+e);
	}
}
}

