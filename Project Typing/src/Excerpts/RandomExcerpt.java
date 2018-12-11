//Name: Ken Thao, Rocky Lee
//Class: CSCI 1082
//Professor: Zak Baani
//Date Due: Dec 12th

package Stories;
import java.util.Random;

public class RandomExcerpts extends Tales{
	
	private int SIZE = 12;
	private String[] story;
	
	
	public RandomExcerpts() {
		
		this.story = new String[SIZE];
		
		 story[0] = "“Took you long enough,” he says, smirking as he juggles his footing and skirts past her, "
		 		+"\n" + "giving her a quick kiss on the cheek as he does. “Don’t you know,” she says, shooting T-2LC "
		 		+ "\n" +"a dubious look, “I have a condition.”";
		
		 story[1] = "Spelda tousled her son’s thick black hair. He’s grown so fast, she thought, and wiped a "
		 		+ "\n" + "tear from the end of her rubbery button-nose. ‘A tale can have many endings,’ she said "
		 		+ "\n" + "sadly, and watched the purple light from the fire gleaming on Twig’s high cheekbones and sharp chin. "
		 		+ "\n" + "‘From the moment you were born,’ she began, as she always began, ‘you were different . . .’";
		 
		 story[2] = "For the last three weeks the Spartans had gone through a daily routine of stretching, isometric exercises, "
		 		+ "\n" + "light sparring drills, and lots of eating. They were under orders to consume five high-protein meals a day."
		 		+ "\n" + "After every meal they had to report to the ship’s medical bay for a series of mineral and vitamin injections. "
		 		+ "\n" + "John was looking forward to getting back to Reach and his normal routine.";
		 
		 story[3] = "October arrived, spreading a damp chill over the grounds and into the castle. Madam Pomfrey, the nurse, was kept "
		 		+ "\n" +  "busy by a sudden spate of colds among the staff and students. Her Pepperup potion worked instantly, though it "
		 		+ "\n" +  "left the drinker smoking at the ears for several hours afterward. Ginny Weasley, who had been looking pale, was"
		 		+ "\n" +  "bullied into taking some by Percy. The steam pouring from under her vivid hair gave the impression that her whole "
		 		+ "\n" +  "head was on fire. ";
		 
		 story[4] = "...yet though Malacath blessed Scourge to be potent against his Daedra kin, he thought not that it should fall into Daedric "
		 		+ "\n" +  "hands, then to serve as a tool for private war among caitiff and forsaken. Thus did Malacath curse the device such that, should"
		 		+ "\n" +  "any dark kin seek to invoke its powers, that a void should open and swallow that Daedra, and purge him into Oblivion's voidstreams,"
		 		+ "\n" +  "from thence to pathfind back to the Real and Unreal Worlds in the full order of time.";
		 
		 story[5] = "War is an ugly thing, but not the ugliest of things. The decayed and degraded state of moral and patriotic feeling which thinks that nothing"
		 		+ "\n" +  "is worth war is much worse. The person who has nothing for which he is willing to fight, nothing which is more important than his own personal"
		 		+ "\n" +  "safety, is a miserable creature, and has no chance of being free unless made or kept so by the exertions of better men than himself.";
		 
		 story[6] = "We know through painful experience that freedom is never voluntarily given by the oppressor; it must be demanded by the oppressed. Frankly, "
		 		+ "\n" +  "I have neveryet engaged in a direct action movement that was ‘well-timed,’ according to the timetable of those who have not suffered unduly from "
		 		+ "\n" +  "the disease of segregation. For years now I have heard the word ‘Wait!’ It rings in the ear of every Negro with a piercing familiarity. "
		 		+ "\n" +  "This ‘Wait’ has almost always meant ‘Never’ ...";
		 
		 story[7] = "Atticus said to Jem one day, “I’d rather you shot at tin cans in the backyard, but I know you’ll go after birds. Shoot all the blue jays you "
		 		+ "\n" +  "want, if you can hit ‘em, but remember it’s a sin to kill a mockingbird.” That was the only time I ever heard Atticus say it was a sin to do "
		 		+ "\n" +  "something, and I asked Miss Maudie about it. “Your father’s right,” she said. “Mockingbirds don’t do one thing except make music for us to enjoy."
		 		+ "\n" +  "They don’t eat up people’s gardens, don’t nest in corn cribs, they don’t do one thing but sing their hearts out for us. That’s why it’s a sin "
		 		+ "\n" +  "to kill a mockingbird.";
		 
		 story[8] = "Being a half-blood is dangerous. It’s scary. Most of the time, it gets you killed in painful, nasty ways. If you’re a normal kid, reading this "
		 		+ "\n" +  "because you think it’s fiction, great. Read on. I envy you for being able to believe that none of this ever happened. But if you recognize yourself"
		 		+ "\n" +  "in these pages – if you feel something stirring inside – stop reading immediately. You might be one of us. And once you know that, it’s only a "
		 		+ "\n" +  "matter of time before they sense it too, and they’ll come for you.";
		 
		 story[9] = "At age 11, he entered the Anbu.[17] Itachi's accomplishments were a source of great pride for his family, his father viewing him as proof of the "
		 		+ "\n" +  "Uchiha's future prosperity and his brother viewing him as a model to live up to. Itachi spent a great deal of time with Sasuke, training with him "
		 		+ "\n" +  "(though rarely actually training him) and giving him the recognition their father did not.  However, for all the attention he received, few truly "
		 		+ "\n" +  "understood Itachi,[15] believing his isolation to be a result of the gap between his abilities and theirs and not his dissatisfaction with the "
		 		+ "\n" +  "shinobi's life of conflict. Eventually, the Uchiha's disdain for their unfair treatment led them to plan a coup d'état.";
		 
		 story[10] = "Something is coming. You can feel it, can’t you? That we are creeping toward the edge… and there will be a reckoning. That is why we started "
		 		+ "\n" +  "The Project. Because we know what happens next. They will come. They will try to take from us. Take our guns, take our freedom. Take our faith. "
		 		+ "\n" +  "We will not let them. We will not let their greed, or their immorality, or their depravity hurt us anymore! There will be no more suffering!";
		 
		 story[11] = "Clear sunlight is falling down\r\n" + 
		 		"Warm wind is wrapping around us\r\n" + 
		 		"Because we’re walking on this good day\r\n" + 
		 		"My heart is beating like crazy\r\n" + 
		 		"You keep saying strange things\r\n" + 
		 		"Asking me random questions like a child\r\n" + 
		 		"Everyone else in the world knows my heart\r\n" + 
		 		"But it’s so frustrating, why don’t you know?\r\n" + 
		 		"I’m in love with you, fool\r\n" + 
		 		"I’m waiting for you\r\n" + 
		 		"Fool, my heart keeps racing\r\n" + 
		 		"My heart keeps booming\r\n" + 
		 		"Why don’t you know?";
		 
	}
	
	//chooses a random story
	public String pickStory() {
		
		Random rand = new Random();
		
		int randomStory = rand.nextInt(12) + 0;
		
		return (story[randomStory]);
		
	}
	
	public void display() {
		

	}
	//getters and setters
	public String[] getStory() {
		
		return story;
		
	}
	
	public static void main(String[] args) {
		
		RandomExcerpts user = new RandomExcerpts();
		
		user.pickStory();
	 
	}
	
}