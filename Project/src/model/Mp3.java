package model;

import java.util.ArrayList;


public class Mp3 {
	
	ArrayList<Mp3> mp3list = new ArrayList<Mp3>();
	
	private String title;
	private String singer;
	private String path;
	
	
		
	
	//기본생성자
	public Mp3() {
		
	}
	
	
	// 생성자
	public Mp3(String title, String singer, String path) {
		super();
		this.title = title;
		this.singer = singer;
		this.path = path;
	}
	//
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
 
	
		
		
	
	
}
	

