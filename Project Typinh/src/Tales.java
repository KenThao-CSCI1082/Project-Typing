//Name: Ken Thao, Rocky Lee
//Class: CSCI 1082
//Professor: Zak Baani
//Date Due:

//y
public class Tales {

	public int SIZE = 2;
	public ScaryStories[] arrayOfArray;
	
	ScaryStories ye = new ScaryStories();
	HappyStories ne = new HappyStories();
	
	public Tales() {
		
		this.arrayOfArray = new ScaryStories[SIZE];
		
		arrayOfArray[0] = ye;
		
	}

	
}
