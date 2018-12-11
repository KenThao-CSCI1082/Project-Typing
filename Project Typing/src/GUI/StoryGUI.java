package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import Stories.RandomExcerpts;

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
	JTextArea displayWPM;
	private final JPanel bottomPanel = new JPanel();
	int counter = 60;
	Boolean isIt = false;

	public StoryGUI() {
		
		setTitle("Project Typing");
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
		bottomPanel.setBounds(0, 320, 1254, 347);
		omniPane.add(bottomPanel);
		bottomPanel.setLayout(null);
		
		
		
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
		
		
		
		//starts timer and typing
		btnStart = new JButton("Start");
		btnStart.setActionCommand("Start");
		btnStart.setToolTipText("Click to start typing below!");
		btnStart.setBounds(186, 247, 97, 48);
		topPanel.add(btnStart);
		
		//Label that displays your WPM at the end of the timer
		displayWPM = new JTextArea();
		displayWPM.setFont(new Font("Courier New", Font.PLAIN, 37));
		displayWPM.setEditable(false);
		displayWPM.setBounds(12, 53, 108, 49);
		topPanel.add(displayWPM);
		
		//Displays Random Story
		displayStoryTxtArea = new JTextArea();
		displayStoryTxtArea.setFont(new Font("Courier New", Font.PLAIN, 14));
		displayStoryTxtArea.setEditable(false);
		displayStoryTxtArea.setBounds(316, 13, 926, 282);
		topPanel.add(displayStoryTxtArea);
		
		//randomly picks a story from RandomExcerpts Class
		btnSelectExcerpt = new JButton("Random Excerpt");
		btnSelectExcerpt.setActionCommand("Random Excerpt");
		btnSelectExcerpt.setToolTipText("Select a random excerpt");
		btnSelectExcerpt.setBounds(167, 105, 129, 60);
		topPanel.add(btnSelectExcerpt);
		RandomExcerpts randomExcerpt = new RandomExcerpts();
		btnSelectExcerpt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent a) {
					String callingBtn = a.getActionCommand();
					if (callingBtn == "Random Excerpt") {
					
						System.out.println("Hello, is this actually working?");
						String pickExcerpt = randomExcerpt.pickStory();
						
						displayStoryTxtArea.append(pickExcerpt + "\n");
				}
			
				}	});
		btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				
                btnStartMouseClicked(evt);
            }
        });}
	
	
	
	private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {
		Timer timer = new Timer(); //new timer
		userTypesTxtArea.setText("");
        counter = 60; //setting the counter to 60 secs
        TimerTask task = new TimerTask() {
            public void run() {
                displayTimerLbl.setText(Integer.toString(counter)); //the timer label to counter
                counter --;
                if (counter == -1){
                	//calculations for WPM (info was found on the internet)
                	String wpm = userTypesTxtArea.getText();
             		int length = wpm.length();
             		int newWPM = length/5;
             		displayWPM.append(newWPM + "\n");
             		
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
	userTypesTxtArea.setBounds(12, 13, 1230, 321);
	bottomPanel.add(userTypesTxtArea);
	
	//scroll pane bar for user
	userTypesScrollPane = new JScrollPane();
	userTypesScrollPane.setBounds(1175, 13, 21, 321);
	bottomPanel.add(userTypesScrollPane);
	}
	
	RandomExcerpts randomExcerpt = new RandomExcerpts();

		
	public StoryGUI(String title) {
		
		//btnSelectExcerpt.addActionListener(new ReBtnListener());
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

