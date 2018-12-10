package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import Stories.HappyStories;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class StoryGUI extends JFrame{
	
	JTextArea userTypesTxtArea;
	JScrollPane userTypesScrollPane;
	JLabel displayTimerLbl;
	JButton btnStart;
	JButton btnSelectExcerpt;
	JTextArea displayStoryTxtArea;
	private JPanel omniPane;
	private final JPanel bottomPanel = new JPanel();
	int counter = 60;
	Boolean isIt = false;
	JLabel displayWPMLbl;

	public StoryGUI() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1272, 714);
		omniPane = new JPanel();
		omniPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(omniPane);
		omniPane.setLayout(null);
		
		//Top Panel and it's contents------------------------------------------------------------------------------------------------------------------
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 1254, 319);
		omniPane.add(topPanel);
		topPanel.setLayout(null);
		
		//displays your time, initial time is 60 seconds
		displayTimerLbl = new JLabel("00:00");
		displayTimerLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		displayTimerLbl.setBounds(12, 170, 108, 49);
		topPanel.add(displayTimerLbl);
				

		//Displays WPM after Timer ends
		displayWPMLbl = new JLabel("0");
		displayWPMLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		displayWPMLbl.setBounds(12, 53, 108, 49);
		topPanel.add(displayWPMLbl);
		bottomPanel.setBounds(0, 320, 1254, 347);
		omniPane.add(bottomPanel);
		bottomPanel.setLayout(null);
		
		//Displays Random Story
		displayStoryTxtArea = new JTextArea();
		displayStoryTxtArea.setEditable(false);
		displayStoryTxtArea.setBounds(316, 13, 879, 282);
		topPanel.add(displayStoryTxtArea);
		
		//WPM Title
		JLabel lblWpm = new JLabel("WPM");
		lblWpm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWpm.setBounds(12, 11, 64, 29);
		topPanel.add(lblWpm);
		
		//Timer Title
		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTimer.setBounds(12, 128, 71, 29);
		topPanel.add(lblTimer);
		
		//randomly picks a story from Happy Story section
		btnSelectExcerpt = new JButton("Random Excerpt");
		btnSelectExcerpt.setToolTipText("Select a random excerpt");
		btnSelectExcerpt.setBounds(167, 105, 129, 60);
		topPanel.add(btnSelectExcerpt);
		
		//starts timer and typing
		btnStart = new JButton("Start");
		btnStart.setActionCommand("Start");
		btnStart.setToolTipText("Click to start typing below!");
		btnStart.setBounds(186, 247, 97, 48);
		topPanel.add(btnStart);
		btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
        });}
	Methods methodCalling = new Methods();
	
	private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {
		Timer timer = new Timer(); //new timer
        counter = 60; //setting the counter to 60 secs
        TimerTask task = new TimerTask() {
            public void run() {                
                displayTimerLbl.setText(Integer.toString(counter)); //the timer label to counter
                counter --;
                if (counter == -1){
                    timer.cancel();
                } else if(isIt){
                    timer.cancel();
                    isIt = false;
                }
            }
        };
    timer.scheduleAtFixedRate(task,1000,1000);    
	}{
	
	//Bottom Panel and it's contents---------------------------------------------------------------------------------------------------------------
	userTypesTxtArea = new JTextArea();
	userTypesTxtArea.setFont(new Font("Courier New", Font.PLAIN, 15));
	userTypesTxtArea.setBounds(12, 13, 1184, 321);
	bottomPanel.add(userTypesTxtArea);
	
	//scroll pane bar for user
	userTypesScrollPane = new JScrollPane();
	userTypesScrollPane.setBounds(1175, 13, 21, 321);
	bottomPanel.add(userTypesScrollPane);
	}
	
	HappyStories randomExcerpt = new HappyStories();
	class ReBtnListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSelectExcerpt) {
				randomExcerpt.pickStory();
				System.out.println("Hello");
			}
		}
	}
	public StoryGUI(String title) {
		
		btnSelectExcerpt.addActionListener(new ReBtnListener());
	}
	
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
}

