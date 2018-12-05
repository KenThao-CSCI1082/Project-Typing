//Name: Ken Thao, Rocky Lee
//Class: CSCI 1082
//Professor: Zak Baani
//Date Due: Dec 12th

//y
import java.util.Random;

public class ScaryStories extends Tales{

	private int SIZE = 12;
	private String[] story;
	
	
	public ScaryStories() {
		
		this.story = new String[SIZE];
		
		 story[0] = "It was the begginning of a new era";
		
		 story[1] = "A Long Time Ago";
		 
		 story[2] = "In a Galaxy";
		 
		 story[3] = "Far Far Away";
		 
		 story[4] = "Atlantis needs something more than a king";
		 
		 story[5] = "There once lived a princess";
		 
		 story[6] = "There once lived a dragon";
		 
		 story[7] = "There once lived an ogre";
		 
		 story[8] = "There once lived a noble steed";
		 
		 story[9] = "There once lived a fairy";
		 
		 story[10] = "There once lived a mouse";
		 
		 story[11] = "The key was on Destiny Island";
		 
	}
	
	public void pickStory() {
		
		Random rand = new Random();
		
		int randomStory = rand.nextInt(10) + 0;
		
		System.out.println(story[randomStory]);
		
	}

	public String[] getStory() {
		
		return story;
	}
	
	public static void main(String[] args) {
		
		ScaryStories user = new ScaryStories();
		
		user.pickStory();
	}

}
