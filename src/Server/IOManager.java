package Server;

/**
 * Controls the input/output for the Can't Stop game. The manager will wait until two players have
 * connected, then will assign player numbers and begin the game, with Player 1 having first turn. 
 * @author Alexander MacKenzie
 * @author Matthew Rozon
 *
 */

import java.io.*;
import java.net.*;

public class IOManager {

	/**
	 * The main method.
	 * @param args command line arguments
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
		UserData users = new UserData();
		BufferedReader inOne = null;
	    PrintWriter outOne = null;
	    String nameOne;
	    
		try{
			incomOne = s.accept();
			inOne = new BufferedReader
	    			(new InputStreamReader(incomOne.getInputStream()));
	        outOne = new PrintWriter
	                (incomOne.getOutputStream(), true);
	        String line = "";
	        String response = "";
	        line = inOne.readLine();
	        nameOne = line.substring(3);
	        if(line.indexOf("R,") != -1){
	        	response = users.retUser(nameOne, 1);
	        	outOne.println(response);
	        	if(response.equals("ack")){
	        		line = inOne.readLine();
	        		response = users.checkPassword(nameOne, line);
	        		outOne.println(response);
	        	}
	        }
	        else{
	        	response = users.newUser(nameOne, 1);
	        	outOne.println(response);
	        	if(response.equals("ack")){
	        		line = inOne.readLine();
	        		response = users.setPassword(nameOne, line);
	        		outOne.println(response);
	        	}
	        }
	        
		}
		catch (IOException e) {
	        System.err.println("Accept failed: " + e.getMessage());
	        System.exit(-1);
	    }
		
		BufferedReader inTwo = null;
	    PrintWriter outTwo = null;
	    String nameTwo;
		try{
			incomTwo = s.accept();
			inTwo = new BufferedReader
	    			(new InputStreamReader(incomTwo.getInputStream()));
	        outTwo = new PrintWriter
	                (incomTwo.getOutputStream(), true);
	        String line = "";
	        String response = "";
	        line = inTwo.readLine();
	        nameTwo = line.substring(3);
	        if(line.indexOf("R,") != -1){
	        	response = users.retUser(nameTwo, 1);
	        	outTwo.println(response);
	        	while(!response.equals("ack")){
	        		line = inTwo.readLine();
	        		nameTwo = line.substring(3);
	        		response = users.retUser(nameTwo, 1);
		        	outTwo.println(response);
	        	}
	        		line = inTwo.readLine();
	        		response = users.checkPassword(nameTwo, line);
	        		outTwo.println(response);
	        }
	        else{
	        	response = users.newUser(nameTwo, 1);
	        	outTwo.println(response);
	        	while(!response.equals("ack")){
	        		line = inTwo.readLine();
	        		response = users.retUser(nameTwo, 1);
		        	outTwo.println(response);
	        	}
	        		line = inTwo.readLine();
	        		response = users.setPassword(nameTwo, line);
	        		outTwo.println(response);
	        }
	        
		}
		catch (IOException e) {
	        System.err.println("Accept failed: " + e.getMessage());
	        System.exit(-1);
	    }

        GameManager game = new GameManager();
	    try {	        
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
	        			outOne.println(users.personalStats(1, "you win"));
	        			outTwo.println("you lose");
	        			outTwo.println(users.personalStats(2, "you lose"));
	        			turnOver = true;
	        			gameOver = true;
	        		}
	        		else if(line.equals("roll")){
	        			outTwo.println(response);
	        		}
	        		else if(!response.equals("err")){
	        			outTwo.println(line);
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
	        			outTwo.println(users.personalStats(2, "you win"));
	        			outOne.println("you lose");
	        			outOne.println(users.personalStats(1, "you lose"));
	        			turnOver = true;
	        			gameOver = true;
	        		}
	        		else if(line.equals("roll")){
	        			outOne.println(response);
	        		}
	        		else if(!response.equals("err")){
	        			outOne.println(line);
	        		}
	        	}
	        	turnOver = false;
	        }//Game over
	        outOne.println(users.highScores());
	        outTwo.println(users.highScores());
	        users.saveUsers();
	    }
	    catch (IOException e) {
	         System.err.println("Unable to read from or write to the client: "
	                            + e.getMessage());
	    }
	}

}
