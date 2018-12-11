//Name: Ken Thao, Rocky Lee
//Class: CSCI 1082
//Professor: Zak Baani
//Date Due: Dec 12th
import java.util.Scanner;

public class Tales {
	
	
	

	public void pickAStory() {
		
		System.out.println("Pick a type of story");
		Scanner userInput = new Scanner(System.in);
		
		String yourPick = userInput.nextLine();
	}
	
	
	
	public void checkWPM() { //one minute timer needed
		
		
	}
	
	public void checkAccuracy() {
		
		String test = "This is just a test. So mind your business!";
		
		int lengthofTest = test.length();
		
		double ye = (double) lengthofTest;
		
		System.out.println("Here is your accuracy: " + ye + "%" );
		
		
	}
	

	
	
	public static void main(String[] args) {
		
		HappyStories youPickedHappy = new HappyStories();
		youPickedHappy.pickStory();
		
		ScaryStories youPickedScary = new ScaryStories();
		youPickedScary.pickStory();
		
		Tales hurhur = new Tales();
		
		hurhur.checkAccuracy();
		
		
	}

	
}
