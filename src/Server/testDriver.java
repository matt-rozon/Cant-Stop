package Server;

//import java.util.Scanner;
import java.io.*;
import java.net.*;

public class testDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		String host = "localhost";
	      int port = 2043;

	      Socket s = null;
	      try {
	         s = new Socket(host, port);
	      }
	      catch (UnknownHostException e) {
	         System.err.println("Unknown host: " + host);
	         System.exit(-1);
	      }
	      catch (IOException e) {
	         System.err.println("Unable to get I/O connection to: "
	                           + host + " on port: " + port);
	         System.exit(-1);
	      }

	      BufferedReader serverIn = null;
	      BufferedReader userIn = null;
	      PrintWriter serverOut = null;
	      try {         
	         serverIn = new BufferedReader
	                 (new InputStreamReader(s.getInputStream()));
	         userIn = new BufferedReader 
	                 (new InputStreamReader(System.in));
	         serverOut = new PrintWriter
	                 (s.getOutputStream(), true /* autoFlush */);
	         
	         String line = serverIn.readLine();
			 System.out.println(line);
			 boolean active;
			 boolean done = false;
			 if (line.equals("1"))
				active = true;
			 else
				active = false;
			
			while (!done){		
				if (active){
					line = userIn.readLine();
					serverOut.println(line);
					String temp = serverIn.readLine();
					System.out.println(temp);
					if ((line.equals("stop") || line.equals("crap")) && (!temp.equals("err")))
						active = false;
				
				}
			
				else{
					line = serverIn.readLine();
					System.out.println(line);
					if (line.equals("go"))
						active = true;
					}
				if(line.equals("you won") || line.equals("you lost"))
					done = true;
			}//while
	      }
	      catch (IOException e) {
	          System.out.println("Problem reading or writing:" + e.getMessage());
	       }

	       try {
	          userIn.close();
	          serverOut.close();
	          serverIn.close();
	          s.close();
	       }
	       catch (IOException e) {
	          System.out.println("Problem closing reader, writer, or socket:" 
	                             + e.getMessage());
	       }
	}

}
