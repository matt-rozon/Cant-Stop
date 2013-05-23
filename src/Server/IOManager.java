/**
 * 
 */
package Server;

/**
 * @author Administrator
 *
 */

import java.io.*;
import java.net.*;

public class IOManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServerSocket s = null;
		try{
			s = new ServerSocket(2043);
		}
		catch (IOException e) {
			System.err.println("Could not listen on port: 2043. " + e.getMessage());
	        System.exit(-1);
	    }
		
		Socket incomOne = null;
		Socket incomTwo = null;
		try{
			incomOne = s.accept();
			incomTwo = s.accept();
		}
		catch (IOException e) {
	        System.err.println("Accept failed: " + e.getMessage());
	        System.exit(-1);
	    }
		BufferedReader inOne = null;
	    PrintWriter outOne = null;
	    BufferedReader inTwo = null;
	    PrintWriter outTwo = null;
	    try {
	    	inOne = new BufferedReader
	    			(new InputStreamReader(incomOne.getInputStream()));
	        outOne = new PrintWriter
	                (incomOne.getOutputStream(), true);
	        inTwo = new BufferedReader
	    			(new InputStreamReader(incomTwo.getInputStream()));
	        outTwo = new PrintWriter
	                (incomTwo.getOutputStream(), true);
	        
	        outOne.println("P1");
	        outTwo.println("P2");
	        
	    }
	    catch (IOException e) {
	         System.err.println("Unable to read from or write to the client: "
	                            + e.getMessage());
	    }
	}

}
