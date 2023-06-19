package model;

import java.util.ArrayList;


public class Mp3 {
	
	ArrayList<Mp3> mp3list = new ArrayList<Mp3>();
	
	
	private String title;
	private String answer;
	private String path;
	
	
	
	
	//기본생성자
	public Mp3() {
		
	}
	
	
	// 생성자
	public Mp3(String title, String answer, String path) {
		
		this.title = title;
		this.answer = answer;
		this.path = path;
	}
	
	public void PrintMp3() {
		
		String[] titles = {
			    "7throom", "Crime_edit", "Crime_or", "Insider_edit", "Insider_or",
			    "IronMan_edit", "IronMan_or", "KingsMan_edit", "KingsMan_or",
			    "NewWorld_edit_short", "NewWorld_or_short", "TheGlory_edit", "TheGlory_or"
			};

			String[] answers = {
			    "7번방의 선물", "범죄와의 전쟁", "범죄와의 전쟁 원본", "내부자들", "내부자들",
			    "Iron Man", "Iron Man", "Kings Man", "Kings Man",
			    "신세계", "신세계", "더 글로리", "더 글로리"
			};

			String[] paths = {
			    "path_to_7throom.MP3", "path_to_Crime_edit.MP3", "path_to_Crime_or.MP3",
			    "path_to_Insider_edit.MP3", "path_to_Insider_or.MP3",
			    "path_to_IronMan_edit.MP3", "path_to_IronMan_or.MP3",
			    "path_to_KingsMan_edit.MP3", "path_to_KingsMan_or.MP3",
			    "path_to_NewWorld_edit_short.MP3", "path_to_NewWorld_or_short.MP3",
			    "path_to_TheGlory_edit.MP3", "path_to_TheGlory_or.MP3"
			};

			for (int i = 0; i < titles.length; i++) {
			    Mp3 mp = new Mp3(titles[i], answers[i], paths[i]);
			    mp3list.add(mp);
			}
//		Mp3 result = 
	}
		
	
	
//	Mp3 m1 = new Mp3("7throom" , "7번방의 선물", path + "7throom_or.MP3" );
//	
//	Mp3 m2 = new Mp3("Crime_edit", "범죄와의 전쟁", path + "Crime_edit.MP3");
//	Mp3 m3 = new Mp3("Crime_or", "범죄와의 전쟁 원본", path + "Crime_or.MP3" );
//	
//	Mp3 m4 = new Mp3("Insider_edit", "내부자들", path + "Insider_edit.MP3");
//	Mp3 m5 = new Mp3("Insider_or", "내부자들", path + "Insider_or.MP3");
//	
//	//대소문자 상관없이 정답이 되도록 확인
//	Mp3 m6 = new Mp3("IronMan_edit", "Iron Man", path + "IronMan_edit.MP3");
//	Mp3 m7 = new Mp3("IronMan_or", "Iron Man", path + "IronMan_or.MP3");
//	
//	Mp3 m8= new Mp3("KingsMan_edit", "Kings Man", path + "KingsMan_edit.MP3");
//	Mp3 m9 = new Mp3("KingsMan_or", "Kings Man", path + "KingsMan_or.MP3");
//	
//	Mp3 m10 = new Mp3("NewWorld_edit_short","신세계",path +"NewWorld_eidt_short.MP3");
//	Mp3 m11 = new Mp3("NewWorld_or_short","신세계",path +"NewWorld_or_short.MP3");
//	
//	Mp3 m12 = new Mp3("TheGlory_edit", "더 글로리", path +"TheGlory_eidt.MP3");
//	Mp3 m13 = new Mp3("TheGlory_or", "더 글로리", path +"TheGlory_or.MP3");

	


	public String getTitle() {
		return title;
	}


	
	public String getAnswer() {
		return answer;
	}


	
	public String getPath() {
		return path;
	}


	
	
}