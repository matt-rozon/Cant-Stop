package GUI;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class WindowManager extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static WindowManager frame = null;
	private static JPanel contentPane1;
	private static JPanel contentPane2;
	private static JPanel contentPane3;
	public static BufferedReader serverIn = null;
    public static BufferedReader userIn = null;
    public static PrintWriter serverOut = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		contentPane2 = new CreateGameWindow();
		contentPane1 = new StartPanel();
		contentPane3 = new LoginPanel();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new WindowManager();
					frame.setVisible(true);
					frame.getContentPane().add(contentPane1);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowManager() {
		setBounds(100, 100, 711, 851);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Can't Stop!");
	}
public static void swap1(){
	frame.getContentPane().remove(contentPane1);
	frame.getContentPane().revalidate();
	frame.getContentPane().add(contentPane3);
}
public static void swap2(){
	frame.getContentPane().remove(contentPane3);
	frame.getContentPane().revalidate();
	frame.getContentPane().add(contentPane2);
}
	

	
public static String connect(String newRet, String name, String pass){
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
    try {
    	serverIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
    	userIn = new BufferedReader(new InputStreamReader(System.in));
    	serverOut = new PrintWriter(s.getOutputStream(), true);
    	
    	serverOut.println(newRet + "," + name);   	
    	String line = serverIn.readLine();
    	if(!line.equals("ack"))
    		return line;
    	serverOut.println(pass);
		System.out.println(line);
		return line;		
    }
    catch (IOException e) {
        System.out.println("Problem reading or writing:" + e.getMessage());
        return "";
    }

	
}}
