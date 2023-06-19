package model;

import java.util.ArrayList;
import java.util.Random;



public class Game {
	Random ran = new Random();
	Mp3 mp3 = new Mp3();
	
	ArrayList<Game> gamelist = new ArrayList<Game>();

	String path = "C:\\Users\\smhrd\\Downloads\\MiniProject_java-main\\mp3\\";

	
	
//	public void printGame() {
//		
//		int random = ran.nextInt(10);
//		
//		
//	}
	
//	private String title;
//	private String answer;
//	private String path;
	
	Mp3 m1 = new Mp3("7throom" , "7번방의 선물", path + "7throom_or.MP3" );
	// Music m2 = new Music("Cupid", "FIFTY FIFTY", folder +"Cupid-FIFTY
	// FIFTY.mp3");
	
	Mp3 m2 = new Mp3("Crime_edit", "범죄와의 전쟁", path + "Crime_edit.MP3");
	Mp3 m3 = new Mp3("Crime_or", "범죄와의 전쟁 원본", path + "Crime_or.MP3" );
	
	Mp3 m4 = new Mp3("Insider_edit", "내부자들", path + "Insider_edit.MP3");
	Mp3 m5 = new Mp3("Insider_or", "내부자들", path + "Insider_or.MP3");
	
	//대소문자 상관없이 정답이 되도록 확인
	Mp3 m6 = new Mp3("IronMan_edit", "Iron Man", path + "IronMan_edit.MP3");
	Mp3 m7 = new Mp3("IronMan_or", "Iron Man", path + "IronMan_or.MP3");
	
	Mp3 m8= new Mp3("KingsMan_edit", "Kings Man", path + "KingsMan_edit.MP3");
	Mp3 m9 = new Mp3("KingsMan_or", "Kings Man", path + "KingsMan_or.MP3");
	
	Mp3 m10 = new Mp3("NewWorld_edit_short","신세계",path +"NewWorld_eidt_short.MP3");
	Mp3 m11 = new Mp3("NewWorld_or_short","신세계",path +"NewWorld_or_short.MP3");
	
	Mp3 m12 = new Mp3("TheGlory_edit", "더 글로리", path +"TheGlory_eidt.MP3");
	Mp3 m13 = new Mp3("TheGlory_or", "더 글로리", path +"TheGlory_or.MP3");
	
//	Mp3 m14 = new Mp3("");
//	Mp3 m15 = new Mp3("");
	
}
	
