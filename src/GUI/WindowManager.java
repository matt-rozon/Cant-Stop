package GUI;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private static JTextField txtBox;
	private static WindowManager frame = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new WindowManager();
					frame.setVisible(true);
					frame.getContentPane().add(createStartWindow());
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
	
private static JPanel createStartWindow() {
	JPanel contentPane = new JPanel();
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setBounds(10, 5, 686, 416);
	lblNewLabel.setIcon(new ImageIcon(StartWindow.class.getResource("/GUI/cantstopTitleImage.jpg")));
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
	contentPane.add(lblNewLabel);
	
	JButton btnNewButton = new JButton("Play");
	btnNewButton.setBounds(203, 432, 268, 72);
	contentPane.add(btnNewButton);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			frame.getContentPane().removeAll();
			frame = null;
			frame.add(loginBox());
		};
	});
	
	JButton btnTutorial = new JButton("Tutorial");
	btnTutorial.setBounds(203, 515, 268, 72);
	contentPane.add(btnTutorial);
	
	JButton btnHighScores = new JButton("High Scores");
	btnHighScores.setBounds(203, 598, 268, 72);
	contentPane.add(btnHighScores);
	
	JButton btnExit = new JButton("Exit");
	btnExit.setBounds(203, 681, 268, 72);
	contentPane.add(btnExit);
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		};
	});
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon(StartWindow.class.getResource("/GUI/rolling-2-dice.png")));
	label.setBounds(22, 451, 658, 384);
	contentPane.add(label);
	
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(null);
	contentPane.setBounds(0, 0, 706, 846);
	contentPane.setSize(706,846);
	
	return contentPane;
}
	
private static JPanel createGameWindow() {
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 706, 846);
		
		JLabel roll1 = new JLabel("Die1");
		roll1.setBounds(64, 14, 126, 105);
		contentPane.add(roll1);
		
		JLabel roll2 = new JLabel("Die1");
		roll2.setBounds(255, 14, 126, 105);
		contentPane.add(roll2);
		
		JLabel roll3 = new JLabel("Die3");
		roll3.setBounds(416, 14, 126, 105);
		contentPane.add(roll3);
		
		JLabel roll4 = new JLabel("Die4");
		roll4.setBounds(552, 11, 126, 105);
		contentPane.add(roll4);
		
		txtBox = new JTextField();
		txtBox.setText(" Please enter your move choices:");
		txtBox.setBounds(204, 169, 269, 20);
		contentPane.add(txtBox);
		txtBox.setColumns(10);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setBounds(9, 130, 134, 38);
		contentPane.add(btnRoll);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(9, 181, 134, 38);
		contentPane.add(btnStop);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(552, 130, 134, 38);
		contentPane.add(btnEnter);
		
		JButton btnCrap = new JButton("Crap");
		btnCrap.setBounds(552, 181, 134, 38);
		contentPane.add(btnCrap);
		
		JLabel n201 = new JLabel("");
		n201.setBounds(442, 21, 0, 0);
		contentPane.add(n201);
		
		JLabel n202 = new JLabel("");
		n202.setBounds(447, 21, 0, 0);
		contentPane.add(n202);
		
		JLabel n203 = new JLabel("");
		n203.setBounds(452, 21, 0, 0);
		contentPane.add(n203);
		
		JLabel n301 = new JLabel("");
		n301.setBounds(457, 21, 0, 0);
		contentPane.add(n301);
		
		JLabel n302 = new JLabel("");
		n302.setBounds(462, 21, 0, 0);
		contentPane.add(n302);
		
		JLabel n303 = new JLabel("");
		n303.setBounds(467, 21, 0, 0);
		contentPane.add(n303);
		
		JLabel n304 = new JLabel("");
		n304.setBounds(472, 21, 0, 0);
		contentPane.add(n304);
		
		JLabel n305 = new JLabel("");
		n305.setBounds(477, 21, 0, 0);
		contentPane.add(n305);
		
		JLabel n401 = new JLabel("");
		n401.setBounds(482, 21, 0, 0);
		contentPane.add(n401);
		
		JLabel n402 = new JLabel("");
		n402.setBounds(487, 21, 0, 0);
		contentPane.add(n402);
		
		JLabel n403 = new JLabel("");
		n403.setBounds(492, 21, 0, 0);
		contentPane.add(n403);
		
		JLabel n404 = new JLabel("");
		n404.setBounds(497, 21, 0, 0);
		contentPane.add(n404);
		
		JLabel n405 = new JLabel("");
		n405.setBounds(502, 21, 0, 0);
		contentPane.add(n405);
		
		JLabel n406 = new JLabel("");
		n406.setBounds(507, 21, 0, 0);
		contentPane.add(n406);
		
		JLabel n407 = new JLabel("");
		n407.setBounds(512, 21, 0, 0);
		contentPane.add(n407);
		
		JLabel n501 = new JLabel("");
		n501.setBounds(517, 21, 0, 0);
		contentPane.add(n501);
		
		JLabel n502 = new JLabel("");
		n502.setBounds(522, 21, 0, 0);
		contentPane.add(n502);
		
		JLabel n503 = new JLabel("");
		n503.setBounds(527, 21, 0, 0);
		contentPane.add(n503);
		
		JLabel n504 = new JLabel("");
		n504.setBounds(532, 21, 0, 0);
		contentPane.add(n504);
		
		JLabel n505 = new JLabel("");
		n505.setBounds(537, 21, 0, 0);
		contentPane.add(n505);
		
		JLabel n506 = new JLabel("");
		n506.setBounds(542, 21, 0, 0);
		contentPane.add(n506);
		
		JLabel n507 = new JLabel("");
		n507.setBounds(547, 21, 0, 0);
		contentPane.add(n507);
		
		JLabel n508 = new JLabel("");
		n508.setBounds(552, 21, 0, 0);
		contentPane.add(n508);
		
		JLabel n509 = new JLabel("");
		n509.setBounds(557, 21, 0, 0);
		contentPane.add(n509);
		
		JLabel n601 = new JLabel("");
		n601.setBounds(562, 21, 0, 0);
		contentPane.add(n601);
		
		JLabel n602 = new JLabel("");
		n602.setBounds(567, 21, 0, 0);
		contentPane.add(n602);
		
		JLabel n603 = new JLabel("");
		n603.setBounds(572, 21, 0, 0);
		contentPane.add(n603);
		
		JLabel n604 = new JLabel("");
		n604.setBounds(577, 21, 0, 0);
		contentPane.add(n604);
		
		JLabel n605 = new JLabel("");
		n605.setBounds(582, 21, 0, 0);
		contentPane.add(n605);
		
		JLabel n606 = new JLabel("");
		n606.setBounds(587, 21, 0, 0);
		contentPane.add(n606);
		
		JLabel n607 = new JLabel("");
		n607.setBounds(592, 21, 0, 0);
		contentPane.add(n607);
		
		JLabel n608 = new JLabel("");
		n608.setBounds(597, 21, 0, 0);
		contentPane.add(n608);
		
		JLabel n609 = new JLabel("");
		n609.setBounds(602, 21, 0, 0);
		contentPane.add(n609);
		
		JLabel n610 = new JLabel("");
		n610.setBounds(607, 21, 0, 0);
		contentPane.add(n610);
		
		JLabel n611 = new JLabel("");
		n611.setBounds(612, 21, 0, 0);
		contentPane.add(n611);
		
		JLabel n701 = new JLabel("");
		n701.setBounds(617, 21, 0, 0);
		contentPane.add(n701);
		
		JLabel n702 = new JLabel("");
		n702.setBounds(622, 21, 0, 0);
		contentPane.add(n702);
		
		JLabel n703 = new JLabel("");
		n703.setBounds(627, 21, 0, 0);
		contentPane.add(n703);
		
		JLabel n704 = new JLabel("");
		n704.setBounds(632, 21, 0, 0);
		contentPane.add(n704);
		
		JLabel n705 = new JLabel("");
		n705.setBounds(637, 21, 0, 0);
		contentPane.add(n705);
		
		JLabel n706 = new JLabel("");
		n706.setBounds(642, 21, 0, 0);
		contentPane.add(n706);
		
		JLabel n707 = new JLabel("");
		n707.setBounds(647, 21, 0, 0);
		contentPane.add(n707);
		
		JLabel n708 = new JLabel("");
		n708.setBounds(652, 21, 0, 0);
		contentPane.add(n708);
		
		JLabel n709 = new JLabel("");
		n709.setBounds(657, 21, 0, 0);
		contentPane.add(n709);
		
		JLabel n710 = new JLabel("");
		n710.setBounds(662, 21, 0, 0);
		contentPane.add(n710);
		
		JLabel n711 = new JLabel("");
		n711.setBounds(667, 21, 0, 0);
		contentPane.add(n711);
		
		JLabel n712 = new JLabel("");
		n712.setBounds(672, 21, 0, 0);
		contentPane.add(n712);
		
		JLabel n713 = new JLabel("");
		n713.setBounds(677, 21, 0, 0);
		contentPane.add(n713);
		
		JLabel n801 = new JLabel("");
		n801.setBounds(682, 21, 0, 0);
		contentPane.add(n801);
		
		JLabel n802 = new JLabel("");
		n802.setBounds(687, 21, 0, 0);
		contentPane.add(n802);
		
		JLabel n803 = new JLabel("");
		n803.setBounds(692, 21, 0, 0);
		contentPane.add(n803);
		
		JLabel n804 = new JLabel("");
		n804.setBounds(697, 21, 0, 0);
		contentPane.add(n804);
		
		JLabel n805 = new JLabel("");
		n805.setBounds(88, 355, 0, 0);
		contentPane.add(n805);
		
		JLabel n806 = new JLabel("");
		n806.setBounds(93, 355, 0, 0);
		contentPane.add(n806);
		
		JLabel n807 = new JLabel("");
		n807.setBounds(98, 355, 0, 0);
		contentPane.add(n807);
		
		JLabel n808 = new JLabel("");
		n808.setBounds(103, 355, 0, 0);
		contentPane.add(n808);
		
		JLabel n809 = new JLabel("");
		n809.setBounds(108, 355, 0, 0);
		contentPane.add(n809);
		
		JLabel n810 = new JLabel("");
		n810.setBounds(113, 355, 0, 0);
		contentPane.add(n810);
		
		JLabel n811 = new JLabel("");
		n811.setBounds(118, 355, 0, 0);
		contentPane.add(n811);
		
		JLabel n901 = new JLabel("");
		n901.setBounds(123, 355, 0, 0);
		contentPane.add(n901);
		
		JLabel n902 = new JLabel("");
		n902.setBounds(128, 355, 0, 0);
		contentPane.add(n902);
		
		JLabel n903 = new JLabel("");
		n903.setBounds(133, 355, 0, 0);
		contentPane.add(n903);
		
		JLabel n904 = new JLabel("");
		n904.setBounds(138, 355, 0, 0);
		contentPane.add(n904);
		
		JLabel n905 = new JLabel("");
		n905.setBounds(143, 355, 0, 0);
		contentPane.add(n905);
		
		JLabel n906 = new JLabel("");
		n906.setBounds(148, 355, 0, 0);
		contentPane.add(n906);
		
		JLabel n907 = new JLabel("");
		n907.setBounds(153, 355, 0, 0);
		contentPane.add(n907);
		
		JLabel n908 = new JLabel("");
		n908.setBounds(158, 355, 0, 0);
		contentPane.add(n908);
		
		JLabel n909 = new JLabel("");
		n909.setBounds(163, 355, 0, 0);
		contentPane.add(n909);
		
		JLabel n1001 = new JLabel("");
		n1001.setBounds(168, 355, 0, 0);
		contentPane.add(n1001);
		
		JLabel n1002 = new JLabel("");
		n1002.setBounds(173, 355, 0, 0);
		contentPane.add(n1002);
		
		JLabel n1003 = new JLabel("");
		n1003.setBounds(178, 355, 0, 0);
		contentPane.add(n1003);
		
		JLabel n1004 = new JLabel("");
		n1004.setBounds(183, 355, 0, 0);
		contentPane.add(n1004);
		
		JLabel n1005 = new JLabel("");
		n1005.setBounds(188, 355, 0, 0);
		contentPane.add(n1005);
		
		JLabel n1006 = new JLabel("");
		n1006.setBounds(193, 355, 0, 0);
		contentPane.add(n1006);
		
		JLabel n1007 = new JLabel("");
		n1007.setBounds(198, 355, 0, 0);
		contentPane.add(n1007);
		
		JLabel n1101 = new JLabel("");
		n1101.setBounds(203, 355, 0, 0);
		contentPane.add(n1101);
		
		JLabel n1102 = new JLabel("");
		n1102.setBounds(208, 355, 0, 0);
		contentPane.add(n1102);
		
		JLabel n1103 = new JLabel("");
		n1103.setBounds(213, 355, 0, 0);
		contentPane.add(n1103);
		
		JLabel n1104 = new JLabel("");
		n1104.setBounds(218, 355, 0, 0);
		contentPane.add(n1104);
		
		JLabel n1105 = new JLabel("");
		n1105.setBounds(223, 355, 0, 0);
		contentPane.add(n1105);
		
		JLabel n1201 = new JLabel("");
		n1201.setBounds(228, 355, 0, 0);
		contentPane.add(n1201);
		
		JLabel n1202 = new JLabel("");
		n1202.setBounds(233, 355, 0, 0);
		contentPane.add(n1202);
		
		JLabel n1203 = new JLabel("");
		n1203.setBounds(238, 355, 0, 0);
		contentPane.add(n1203);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GameWindow.class.getResource("/GUI/grid3.jpg")));
		lblNewLabel.setBounds(87, 200, 530, 635);
		contentPane.add(lblNewLabel);
	
		return contentPane;
	}

public static JDialog loginBox() {
	
	final JDialog loginBox1 = new DBox();
	loginBox1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	loginBox1.setVisible(true);
	
	loginBox1.setBounds(100, 100, 266, 297);
	loginBox1.getContentPane().setLayout(null);
	
	JRadioButton rdbtnNewUser = new JRadioButton("New User");
	rdbtnNewUser.setBounds(6, 7, 109, 23);
	loginBox1.getContentPane().add(rdbtnNewUser);
	
	JTextField txtUserName = new JTextField();
	txtUserName.setText("User Name");
	txtUserName.setBounds(6, 37, 233, 23);
	loginBox1.getContentPane().add(txtUserName);
	txtUserName.setColumns(10);
	
	JRadioButton rdbtnReturningUser = new JRadioButton("Returning User");
	rdbtnReturningUser.setBounds(117, 7, 109, 23);
	loginBox1.getContentPane().add(rdbtnReturningUser);
	
	JTextField txtPassword = new JTextField();
	txtPassword.setText("Password");
	txtPassword.setBounds(6, 71, 233, 23);
	loginBox1.getContentPane().add(txtPassword);
	txtPassword.setColumns(10);
	
	JButton btnNewButton = new JButton("GO!");
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 27));
	btnNewButton.setBounds(6, 105, 233, 143);
	loginBox1.getContentPane().add(btnNewButton);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			frame.setLayout(null);
			frame.getContentPane().add(createGameWindow());
			loginBox1.setVisible(false);
		};
	});
	
	return loginBox1;

}
}
