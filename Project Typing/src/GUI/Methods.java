package GUI;

import java.util.Scanner;

public class Methods {
	Scanner kyb = new Scanner(System.in);
	
	String words = "A long time ago in a galaxy far far away....";
	
	String story = kyb.nextLine();
	
	int length = story.length();
	int wordsPerMinute = story.length();
	
	
	public static void main(String[] args) {
		
		Methods test = new Methods();
		
		test.calculateWPM();
		
		
	}
	public void calculateWPM() {
		
		int WPM = wordsPerMinute/5;
		
		if (wordsPerMinute == 0) {
			
			System.out.print("You didn't type anything, pathetic!" + "\n");
		}
		
		System.out.println("Story: " + words);
		System.out.println("What you typed: " + story);
		System.out.println("Characters: " + length);
		System.out.println("Words Per Minute: " + WPM);
		}
	
	


}
