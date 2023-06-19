package view;

import model.User;

public class Idrp extends User{
	
	
	
				
	

	public void Status() {
		// TODO 자동 생성된 메소드 스텁
		
		//모르겟다
		
//		System.out.println("아이디 "+user.getUser_id()+ " \t 내 랭크" + user.getUser_rank()+" : 내 포인트"+ user.getUser_point());
		System.out.print("아이디 : " + getUser_id() );
		System.out.print("\t내 랭킹 : " + getUser_rank() );
		System.out.println("\t내 포인트 : " + getUser_point() );
		
	}
}
