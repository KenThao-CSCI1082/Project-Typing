package GUI;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Methods {
	Scanner kyb = new Scanner(System.in);
	
	String words = "A long time ago in a galaxy far far away....";
	
	
	String story = kyb.nextLine();
	
	int length = story.length();
	int wordsPerMinute = story.length();
	
	
	public static void main(String[] args) {
		
		System.out.println("Type!");
		Methods test = new Methods();
		
		test.calculateWPM();
		
		
	}
	public int calculateWPM() {
		int WPM = wordsPerMinute/5;
		return WPM;
		
		}
	
	
		int secondsPassed = 0;
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			public void run() {
			secondsPassed++;
			System.out.println("Seconds Passed: " + secondsPassed);
				
				
			}
			
			public void start() {
				
				timer.scheduleAtFixedRate(task, 1000, 1000);
			}
			
			
		};
	
	


}
