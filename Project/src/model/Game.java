package model;

import java.util.ArrayList;
import java.util.Random;

public abstract class Game {
	Random ran = new Random();
	Mp3 mp3player = new Mp3();
	
	ArrayList<Game> gamelist = new ArrayList<Game>();

	protected Mp3 mp3;
	protected String question;
	public String answer;
	protected int point;

	
	public void printGame() {
		
		int random = ran.nextInt(10);
		
		
		
	}
	
	
}
	
