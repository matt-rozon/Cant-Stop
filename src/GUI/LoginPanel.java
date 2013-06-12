package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginPanel extends JPanel {
	private JTextField txtUsername, txtPassword;
	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		
		JButton btnNewButton = new JButton("GO!");
		btnNewButton.setBounds(203, 568, 268, 72);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				WindowManager.connect();
				WindowManager.swap2();
			};
		});
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBounds(0, 0, 706, 846);
		setSize(706,846);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(203, 451, 268, 20);
		add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(203, 482, 268, 20);
		add(txtPassword);
		txtPassword.setColumns(10);
		
		JRadioButton rdbtnNewUser = new JRadioButton("New User");
		rdbtnNewUser.setBounds(319, 512, 109, 23);
		add(rdbtnNewUser);
		
		JRadioButton rdbtnReturningUser = new JRadioButton("Returning User");
		rdbtnReturningUser.setBounds(319, 538, 119, 23);
		add(rdbtnReturningUser);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 5, 686, 416);
		lblNewLabel.setIcon(new ImageIcon(WindowManager.class.getResource("/GUI/cantstopTitleImage.jpg")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
		add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(WindowManager.class.getResource("/GUI/rolling-2-dice.png")));
		label.setBounds(22, 451, 658, 384);
		add(label);
	}

}
