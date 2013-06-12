package Server;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserData {
	private ArrayList<String> users;
	private BufferedReader in;
	private PrintWriter out;
	private File file;
	private String nameOne, nameTwo;
	
	public UserData(){
		file = new File("users.txt");
		if(file.exists()){
			try{
				in = new BufferedReader(new FileReader(file));
				users = new ArrayList<String>();
				while(in.ready()){
					users.add(in.readLine());
				}
			}
			catch(FileNotFoundException e){
			}
			catch(IOException e){
			}
		}
		else
			users = new ArrayList<String>();
	}
	
	public String newUser(String name, int in){
		if(in == 1)
			nameOne = name;
		else
			nameTwo = name;
		String temp;
		int index = 0;
		while(index < users.size()){
			temp = users.get(index);
			if(temp.indexOf(name) != -1)
				return "err,Duplicate User Name";
			index++;
		}
		users.add(name);
		return "ack";
	}
	
	public String retUser(String name, int in){
		if(in == 1)
			nameOne = name;
		else
			nameTwo = name;
		String temp;
		int index = 0;
		while(index < users.size()){
			temp = users.get(index);
			if(temp.indexOf(name) != -1)
				return "ack";
			index++;
		}
		return "err,Unkown User";
	}
	
	public String setPassword(String name, String pass){
		int index = users.indexOf(name);
		users.remove(index);
		users.add(name + "," + pass + ",0,0");
		return "ack";
	}
	
	public String checkPassword(String name, String pass){
		String temp;
		int index = 0;
		while(index < users.size()){
			temp = users.get(index);
			if(temp.indexOf(name) != -1){
				if(temp.indexOf(pass) != -1)
					return "ack";
				else
					return "err,Invalid Password";
			}
			index++;
		}
		return "err,Invalid Password";
	}
	
	public String personalStats(int in, String result){
		String name, tempOne;
		if(in == 1)
			name = nameOne;
		else
			name = nameTwo;
		String[] arr = new String[5];
		int index = 0;
		Scanner sc;
		while(index < users.size()){
			tempOne = users.get(index);
			if(tempOne.indexOf(name) != -1){
				sc = new Scanner(tempOne);
				sc.useDelimiter(",");
				for(int i = 0; i < arr.length; i++){
					arr[i] = sc.next();
				}
				if(result.equals("you win")){
					arr[2] = Integer.parseInt(arr[2]) + 1 + "";
					arr[4] = (Integer.parseInt(arr[2]) - Integer.parseInt(arr[3])) * 10 + "";
					tempOne = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4];
					users.remove(index);
					users.add(tempOne);
					return arr[2] + "," + arr[3] + "," + arr[4];
				}
					
				else{
					arr[2] = Integer.parseInt(arr[3]) + 1 + "";
					arr[4] = (Integer.parseInt(arr[2]) - Integer.parseInt(arr[3])) * 10 + "";
					tempOne = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4];
					users.remove(index);
					users.add(tempOne);
					return arr[2] + "," + arr[3] + "," + arr[4];
				}
			}
			index++;
		}
		return "err";
	}
	
	public String highScores(){
		String[][] arr = new String[users.size()][5];
		Scanner sc;
		for(int i = 0; i < arr.length; i++){
			sc = new Scanner(users.get(i));
			sc.useDelimiter(",");
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = sc.next();
			}
		}
		int[] highOne = {0, 0};
		int[] highTwo = {0, 0};
		int[] highThree = {0, 0};
		for(int i = 0; i < arr.length; i++){
			int temp = Integer.parseInt(arr[i][4]);
			if(temp > highOne[0]){
				highOne[0] = i;
				highOne[1] = temp;
			}
			else if(temp > highTwo[0]){
				highTwo[0] = i;
				highTwo[1] = temp;
			}
			else if(temp > highThree[0]){
				highThree[0] = i;
				highThree[1] = temp;
			}
		}
		return arr[highOne[0]][0] + "," + arr[highOne[0]][1] + "," + arr[highOne[0]][2] + "," + arr[highOne[0]][3] + "," + arr[highOne[0]][4]
				+ "," + arr[highTwo[0]][0] + "," + arr[highTwo[0]][1] + "," + arr[highTwo[0]][2] + "," + arr[highTwo[0]][3] + "," + arr[highTwo[0]][4]
				+ "," + arr[highThree[0]][0] + "," + arr[highThree[0]][1] + "," + arr[highThree[0]][2] + "," + arr[highThree[0]][3] + "," + arr[highThree[0]][4];
	}
	
	public void saveUsers(){
		if(file.exists()){
			try{
				file.delete();
				file.createNewFile();
				out = new PrintWriter(new FileWriter(file));
				for(int i = 0; i < users.size(); i++){
					out.println(users.get(i));
				}
			}
			catch(IOException e){
			}
			finally{
				out.close();
			}
		}
		else{
			try{
				file.createNewFile();
				out = new PrintWriter(new FileWriter(file));
				for(int i = 0; i < users.size(); i++){
					out.println(users.get(i));
				}
			}
			catch(IOException e){
			}
			finally{
				out.close();
			}
		}
	}
}
