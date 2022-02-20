import java.io.*;
import java.net.*;
public class Client {
 public static void main(String[] args) {
	try {
		Socket s=new Socket("localhost",1234);
		
		DataOutputStream dt=new DataOutputStream(s.getOutputStream());
		
		dt.writeUTF("Hello Sharks...");
		dt.flush();
		dt.close();
		s.close();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
 }
}
