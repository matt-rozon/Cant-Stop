package GUI;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class DBox extends JDialog {
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBox dialog = new DBox();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DBox() {
		setBounds(100, 100, 266, 297);
		getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewUser = new JRadioButton("New User");
		rdbtnNewUser.setBounds(6, 7, 109, 23);
		getContentPane().add(rdbtnNewUser);
		
		txtUserName = new JTextField();
		txtUserName.setText("User Name");
		txtUserName.setBounds(6, 37, 233, 23);
		getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JRadioButton rdbtnReturningUser = new JRadioButton("Returning User");
		rdbtnReturningUser.setBounds(117, 7, 109, 23);
		getContentPane().add(rdbtnReturningUser);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(6, 71, 233, 23);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("GO!");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnNewButton.setBounds(6, 105, 233, 143);
		getContentPane().add(btnNewButton);

	}
}
