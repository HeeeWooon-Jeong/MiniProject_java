package model;

public class User {
	
	protected String user_id ;
	protected String user_pw ;
	private int user_point ;
	private int user_rank ;
	
	
	// 기본 유저 생성자
	

	public User() {
		
	}
	
	// 유저 생성자
	public User(String user_id, String user_pw) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
	}
	
	
	// 유저 겟터 셋터
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public int getUser_point() {
		return user_point;
	}
	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}
	public int getUser_rank() {
		return user_rank;
	}
	public void setUser_rank(int user_rank) {
		this.user_rank = user_rank;
	}

	
	
}
