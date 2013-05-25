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
		
		GameManager game = new GameManager();
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
	        
	        outOne.println("1");
	        outTwo.println("2");
	        
	        boolean gameOver = false;
	        boolean turnOver = false;
	        String line = "";
	        String response = "";
	        while(!gameOver){
	        	while(!turnOver){
	        		line = inOne.readLine();
	        		response = game.userChoice(line);
	        		outOne.println(response);
	        		if((response.equals("ack") && line.equals("stop")) ||
	        				(response.equals("ack") && line.equals("crap"))){
	        			outTwo.println("go");
	        			turnOver = true;
	        		}
	        		else if(response.equals("you won")){
	        			outTwo.println("you lose");
	        			gameOver = true;
	        			break;
	        		}
	        		else if(!response.equals("err")){
	        			outTwo.println(response);
	        		}
	        	}
	        	if(gameOver)
	        		break;
	        	
	        	turnOver = false;
	        	while(!turnOver){
	        		line = inTwo.readLine();
	        		response = game.userChoice(line);
	        		outTwo.println(response);
	        		if((response.equals("ack") && line.equals("stop")) ||
	        				(response.equals("ack") && line.equals("crap"))){
	        			outOne.println("go");
	        			turnOver = true;
	        		}
	        		else if(response.equals("you won")){
	        			outOne.println("you lose");
	        			gameOver = true;
	        			break;
	        		}
	        		else if(!response.equals("err")){
	        			outOne.println(response);
	        		}
	        	}
	        	turnOver = false;
	        }//Game over
	    }
	    catch (IOException e) {
	         System.err.println("Unable to read from or write to the client: "
	                            + e.getMessage());
	    }
	}

}
