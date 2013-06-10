package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StartWindow extends JPanel {

	private static JPanel contentPane;
	/**
	 * Create the panel.
	 */
	public StartWindow() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 5, 686, 416);
		lblNewLabel.setIcon(new ImageIcon(StartWindow.class.getResource("/GUI/cantstopTitleImage.jpg")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setBounds(203, 432, 268, 72);
		add(btnNewButton);
		
		JButton btnTutorial = new JButton("Tutorial");
		btnTutorial.setBounds(203, 515, 268, 72);
		add(btnTutorial);
		
		JButton btnHighScores = new JButton("High Scores");
		btnHighScores.setBounds(203, 598, 268, 72);
		add(btnHighScores);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(203, 681, 268, 72);
		add(btnExit);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(StartWindow.class.getResource("/GUI/rolling-2-dice.png")));
		label.setBounds(22, 451, 658, 384);
		add(label);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 706, 846);
		contentPane.setSize(706,846);
	}
}
