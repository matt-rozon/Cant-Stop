package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;




public class CreateGameWindow extends JPanel {
	private static JTextField txtBox;
	private static JLabel roll1, roll2, roll3, roll4;
	private static String diceRoll;
	private static int place1, place2;
	private static JLabel n201, n301, n401, n501, n601, n701, n801, n901, n1001, n1101, n1201;
	private static String text;
	/**
	 * Create the panel.
	 */
	public CreateGameWindow() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBounds(0, 0, 706, 846);
		
		roll1 = new JLabel();
		roll1.setBounds(64, 14, 126, 105);
		add(roll1);
			
		roll2 = new JLabel();
		roll2.setBounds(255, 14, 126, 105);
		add(roll2);
		
		roll3 = new JLabel();
		roll3.setBounds(416, 14, 126, 105);
		add(roll3);
		
		roll4 = new JLabel();
		roll4.setBounds(552, 11, 126, 105);
		add(roll4);
		
		txtBox = new JTextField();
		txtBox.setText("Please enter your move choices:");
		txtBox.setBounds(204, 169, 269, 20);
		add(txtBox);
		txtBox.setColumns(10);

		JButton btnRoll = new JButton("Roll");
		btnRoll.setBounds(9, 130, 134, 38);
		add(btnRoll);
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				WindowManager.serverOut.println("roll");
				
				Scanner sc = new Scanner(WindowManager.serverIn);
				
				diceRoll = sc.nextLine();
				System.out.println(diceRoll);
				String[] ar=diceRoll.split(",");
				int rollInt1 = Integer.parseInt(ar[0]);
				int rollInt2 = Integer.parseInt(ar[1]);
				int rollInt3 = Integer.parseInt(ar[2]);
				int rollInt4 = Integer.parseInt(ar[3]);
				
				switch(rollInt1){
					case 1:
						roll1.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-1.png")));
						break;
					case 2: 
						roll1.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-2.png")));
						break;
					case 3:
						roll1.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-3.png")));
						break;
					case 4: 
						roll1.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-4.png")));
						break;
					case 5:
						roll1.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-5.png")));
						break;
					case 6:
						roll1.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-6.png")));
						break;
				}
				switch(rollInt2){
					case 1:
						roll2.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-1.png")));
						break;
					case 2: 
						roll2.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-2.png")));
						break;
					case 3:
						roll2.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-3.png")));
						break;
					case 4: 
						roll2.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-4.png")));
						break;
					case 5:
						roll2.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-5.png")));
						break;
					case 6:
						roll2.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-6.png")));
						break;
				}
				switch(rollInt3){
					case 1:
						roll3.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-1.png")));
						break;
					case 2: 
						roll3.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-2.png")));
						break;
					case 3:
						roll3.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-3.png")));
						break;
					case 4: 
						roll3.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-4.png")));
						break;
					case 5:
						roll3.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-5.png")));
						break;
					case 6:
						roll3.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-6.png")));
						break;
				}
				switch(rollInt4){
					case 1:
						roll4.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-1.png")));
						break;
					case 2: 
						roll4.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-2.png")));
						break;
					case 3:
						roll4.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-3.png")));
						break;
					case 4: 
						roll4.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-4.png")));
						break;
					case 5:
						roll4.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-5.png")));
						break;
					case 6:
						roll4.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/Dice-6.png")));
						break;
			}
			};
		});
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(9, 181, 134, 38);
		add(btnStop);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				WindowManager.serverOut.println("stop");
			};
		});
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(552, 130, 134, 38);
		add(btnEnter);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				WindowManager.serverOut.println(txtBox.getText());
				Scanner sc = new Scanner(WindowManager.serverIn);
				try {
					text = WindowManager.serverIn.readLine();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(text.equals("ack")){

					System.out.println(txtBox.getText() + 4);
					diceRoll = txtBox.getText();
					String[] ar=diceRoll.split(",");
					place1 = Integer.parseInt(ar[0]);
					place2 = Integer.parseInt(ar[1]);
					switch(place1){
					case 2: 
						n201.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 3:
						n301.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 4:
						n401.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 5:
						n501.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 6:
						n601.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 7:
						n701.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 8:
						n801.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 9:
						n901.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 10:
						n1001.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 11:
						n1101.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					case 12:
						n1201.setIcon(new ImageIcon(CreateGameWindow.class.getResource("/GUI/p1Piece.png")));
						break;
					}
				}
				else{
					txtBox.setText("Error, please enter a correct roll");
				}
			};
		});
		
		JButton btnCrap = new JButton("Crap");
		btnCrap.setBounds(552, 181, 134, 38);
		add(btnCrap);
		btnCrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				WindowManager.serverOut.println("crap");
			};
		});
		
		n201 = new JLabel("");
		n201.setBounds(442, 21, 0, 0);
		add(n201);
		
		JLabel n202 = new JLabel("");
		n202.setBounds(447, 21, 0, 0);
		add(n202);
		
		JLabel n203 = new JLabel("");
		n203.setBounds(452, 21, 0, 0);
		add(n203);
		
		n301 = new JLabel("");
		n301.setBounds(457, 21, 0, 0);
		add(n301);
		
		JLabel n302 = new JLabel("");
		n302.setBounds(462, 21, 0, 0);
		add(n302);
		
		JLabel n303 = new JLabel("");
		n303.setBounds(467, 21, 0, 0);
		add(n303);
		
		JLabel n304 = new JLabel("");
		n304.setBounds(472, 21, 0, 0);
		add(n304);
		
		JLabel n305 = new JLabel("");
		n305.setBounds(477, 21, 0, 0);
		add(n305);
		
		n401 = new JLabel("");
		n401.setBounds(482, 21, 0, 0);
		add(n401);
		
		JLabel n402 = new JLabel("");
		n402.setBounds(487, 21, 0, 0);
		add(n402);
		
		JLabel n403 = new JLabel("");
		n403.setBounds(492, 21, 0, 0);
		add(n403);
		
		JLabel n404 = new JLabel("");
		n404.setBounds(497, 21, 0, 0);
		add(n404);
		
		JLabel n405 = new JLabel("");
		n405.setBounds(502, 21, 0, 0);
		add(n405);
		
		JLabel n406 = new JLabel("");
		n406.setBounds(507, 21, 0, 0);
		add(n406);
		
		JLabel n407 = new JLabel("");
		n407.setBounds(512, 21, 0, 0);
		add(n407);
		
		n501 = new JLabel("");
		n501.setBounds(517, 21, 0, 0);
		add(n501);
		
		JLabel n502 = new JLabel("");
		n502.setBounds(522, 21, 0, 0);
		add(n502);
		
		JLabel n503 = new JLabel("");
		n503.setBounds(527, 21, 0, 0);
		add(n503);
		
		JLabel n504 = new JLabel("");
		n504.setBounds(532, 21, 0, 0);
		add(n504);
		
		JLabel n505 = new JLabel("");
		n505.setBounds(537, 21, 0, 0);
		add(n505);
		
		JLabel n506 = new JLabel("");
		n506.setBounds(542, 21, 0, 0);
		add(n506);
		
		JLabel n507 = new JLabel("");
		n507.setBounds(547, 21, 0, 0);
		add(n507);
		
		JLabel n508 = new JLabel("");
		n508.setBounds(552, 21, 0, 0);
		add(n508);
		
		JLabel n509 = new JLabel("");
		n509.setBounds(557, 21, 0, 0);
		add(n509);
		
		n601 = new JLabel("");
		n601.setBounds(562, 21, 0, 0);
		add(n601);
		
		JLabel n602 = new JLabel("");
		n602.setBounds(567, 21, 0, 0);
		add(n602);
		
		JLabel n603 = new JLabel("");
		n603.setBounds(572, 21, 0, 0);
		add(n603);
		
		JLabel n604 = new JLabel("");
		n604.setBounds(577, 21, 0, 0);
		add(n604);
		
		JLabel n605 = new JLabel("");
		n605.setBounds(582, 21, 0, 0);
		add(n605);
		
		JLabel n606 = new JLabel("");
		n606.setBounds(587, 21, 0, 0);
		add(n606);
		
		JLabel n607 = new JLabel("");
		n607.setBounds(592, 21, 0, 0);
		add(n607);
		
		JLabel n608 = new JLabel("");
		n608.setBounds(597, 21, 0, 0);
		add(n608);
		
		JLabel n609 = new JLabel("");
		n609.setBounds(602, 21, 0, 0);
		add(n609);
		
		JLabel n610 = new JLabel("");
		n610.setBounds(607, 21, 0, 0);
		add(n610);
		
		JLabel n611 = new JLabel("");
		n611.setBounds(612, 21, 0, 0);
		add(n611);
		
		n701 = new JLabel("");
		n701.setBounds(617, 21, 0, 0);
		add(n701);
		
		JLabel n702 = new JLabel("");
		n702.setBounds(622, 21, 0, 0);
		add(n702);
		
		JLabel n703 = new JLabel("");
		n703.setBounds(627, 21, 0, 0);
		add(n703);
		
		JLabel n704 = new JLabel("");
		n704.setBounds(632, 21, 0, 0);
		add(n704);
		
		JLabel n705 = new JLabel("");
		n705.setBounds(637, 21, 0, 0);
		add(n705);
		
		JLabel n706 = new JLabel("");
		n706.setBounds(642, 21, 0, 0);
		add(n706);
		
		JLabel n707 = new JLabel("");
		n707.setBounds(647, 21, 0, 0);
		add(n707);
		
		JLabel n708 = new JLabel("");
		n708.setBounds(652, 21, 0, 0);
		add(n708);
		
		JLabel n709 = new JLabel("");
		n709.setBounds(657, 21, 0, 0);
		add(n709);
		
		JLabel n710 = new JLabel("");
		n710.setBounds(662, 21, 0, 0);
		add(n710);
		
		JLabel n711 = new JLabel("");
		n711.setBounds(667, 21, 0, 0);
		add(n711);
		
		JLabel n712 = new JLabel("");
		n712.setBounds(672, 21, 0, 0);
		add(n712);
		
		JLabel n713 = new JLabel("");
		n713.setBounds(677, 21, 0, 0);
		add(n713);
		
		n801 = new JLabel("");
		n801.setBounds(682, 21, 0, 0);
		add(n801);
		
		JLabel n802 = new JLabel("");
		n802.setBounds(687, 21, 0, 0);
		add(n802);
		
		JLabel n803 = new JLabel("");
		n803.setBounds(692, 21, 0, 0);
		add(n803);
		
		JLabel n804 = new JLabel("");
		n804.setBounds(697, 21, 0, 0);
		add(n804);
		
		JLabel n805 = new JLabel("");
		n805.setBounds(88, 355, 0, 0);
		add(n805);
		
		JLabel n806 = new JLabel("");
		n806.setBounds(93, 355, 0, 0);
		add(n806);
		
		JLabel n807 = new JLabel("");
		n807.setBounds(98, 355, 0, 0);
		add(n807);
		
		JLabel n808 = new JLabel("");
		n808.setBounds(103, 355, 0, 0);
		add(n808);
		
		JLabel n809 = new JLabel("");
		n809.setBounds(108, 355, 0, 0);
		add(n809);
		
		JLabel n810 = new JLabel("");
		n810.setBounds(113, 355, 0, 0);
		add(n810);
		
		JLabel n811 = new JLabel("");
		n811.setBounds(118, 355, 0, 0);
		add(n811);
		
		n901 = new JLabel("");
		n901.setBounds(123, 355, 0, 0);
		add(n901);
		
		JLabel n902 = new JLabel("");
		n902.setBounds(128, 355, 0, 0);
		add(n902);
		
		JLabel n903 = new JLabel("");
		n903.setBounds(133, 355, 0, 0);
		add(n903);
		
		JLabel n904 = new JLabel("");
		n904.setBounds(138, 355, 0, 0);
		add(n904);
		
		JLabel n905 = new JLabel("");
		n905.setBounds(143, 355, 0, 0);
		add(n905);
		
		JLabel n906 = new JLabel("");
		n906.setBounds(148, 355, 0, 0);
		add(n906);
		
		JLabel n907 = new JLabel("");
		n907.setBounds(153, 355, 0, 0);
		add(n907);
		
		JLabel n908 = new JLabel("");
		n908.setBounds(158, 355, 0, 0);
		add(n908);
		
		JLabel n909 = new JLabel("");
		n909.setBounds(163, 355, 0, 0);
		add(n909);
		
		n1001 = new JLabel("");
		n1001.setBounds(168, 355, 0, 0);
		add(n1001);
		
		JLabel n1002 = new JLabel("");
		n1002.setBounds(173, 355, 0, 0);
		add(n1002);
		
		JLabel n1003 = new JLabel("");
		n1003.setBounds(178, 355, 0, 0);
		add(n1003);
		
		JLabel n1004 = new JLabel("");
		n1004.setBounds(183, 355, 0, 0);
		add(n1004);
		
		JLabel n1005 = new JLabel("");
		n1005.setBounds(188, 355, 0, 0);
		add(n1005);
		
		JLabel n1006 = new JLabel("");
		n1006.setBounds(193, 355, 0, 0);
		add(n1006);
		
		JLabel n1007 = new JLabel("");
		n1007.setBounds(198, 355, 0, 0);
		add(n1007);
		
		n1101 = new JLabel("");
		n1101.setBounds(203, 355, 0, 0);
		add(n1101);
		
		JLabel n1102 = new JLabel("");
		n1102.setBounds(208, 355, 0, 0);
		add(n1102);
		
		JLabel n1103 = new JLabel("");
		n1103.setBounds(213, 355, 0, 0);
		add(n1103);
		
		JLabel n1104 = new JLabel("");
		n1104.setBounds(218, 355, 0, 0);
		add(n1104);
		
		JLabel n1105 = new JLabel("");
		n1105.setBounds(223, 355, 0, 0);
		add(n1105);
		
		n1201 = new JLabel("");
		n1201.setBounds(228, 355, 0, 0);
		add(n1201);
		
		JLabel n1202 = new JLabel("");
		n1202.setBounds(233, 355, 0, 0);
		add(n1202);
		
		JLabel n1203 = new JLabel("");
		n1203.setBounds(238, 355, 0, 0);
		add(n1203);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(WindowManager.class.getResource("/GUI/grid3.jpg")));
		lblNewLabel.setBounds(87, 200, 530, 635);
		add(lblNewLabel);
	}

}
