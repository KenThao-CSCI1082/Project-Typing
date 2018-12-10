package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class StoryGUI extends JFrame {

	private JPanel omniPane;
	private final JPanel bottomPanel = new JPanel();
	private JTextField userTypesTxtFld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryGUI frame = new StoryGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StoryGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1272, 714);
		omniPane = new JPanel();
		omniPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(omniPane);
		omniPane.setLayout(null);
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 1254, 319);
		omniPane.add(topPanel);
		topPanel.setLayout(null);
		
		JTextArea displayStoryTxtArea = new JTextArea();
		displayStoryTxtArea.setBounds(316, 13, 879, 282);
		topPanel.add(displayStoryTxtArea);
		
		JLabel lblWpm = new JLabel("WPM");
		lblWpm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWpm.setBounds(12, 11, 64, 29);
		topPanel.add(lblWpm);
		
		JTextArea displayWPMTxtArea = new JTextArea();
		displayWPMTxtArea.setEditable(false);
		displayWPMTxtArea.setBounds(12, 53, 108, 49);
		topPanel.add(displayWPMTxtArea);
		
		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTimer.setBounds(12, 128, 71, 29);
		topPanel.add(lblTimer);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(12, 168, 108, 49);
		topPanel.add(textArea);
		bottomPanel.setBounds(0, 320, 1254, 347);
		omniPane.add(bottomPanel);
		bottomPanel.setLayout(null);
		
		userTypesTxtFld = new JTextField();
		userTypesTxtFld.setBounds(12, 13, 1184, 321);
		bottomPanel.add(userTypesTxtFld);
		userTypesTxtFld.setColumns(10);
		
		
		
	}
	
}