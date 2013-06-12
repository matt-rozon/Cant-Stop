package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class StartPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public StartPanel() {
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 5, 686, 416);
		lblNewLabel.setIcon(new ImageIcon(WindowManager.class.getResource("/GUI/cantstopTitleImage.jpg")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setBounds(203, 432, 268, 72);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				WindowManager.swap1();
			};
		});
		
		JButton btnTutorial = new JButton("Tutorial");
		btnTutorial.setBounds(203, 515, 268, 72);
		add(btnTutorial);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(203, 598, 268, 72);
		add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			};
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(WindowManager.class.getResource("/GUI/rolling-2-dice.png")));
		label.setBounds(22, 451, 658, 384);
		add(label);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBounds(0, 0, 706, 846);
		setSize(706,846);
	}

}
