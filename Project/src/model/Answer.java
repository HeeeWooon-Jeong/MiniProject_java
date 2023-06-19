package model;

import controller.CStore;
import view.Idrp;
import view.Store;

public class Answer {
	// 아이디 랭크 포인트
	Idrp idrp = new Idrp();
	// 정답 처리
	Store storeView = new Store();
	
					
		public void Scoring(String commit) {
		
//		System.out.println(n + "번 문제입니다...");
//		System.out.println("\t이 영화의 제목을 맞춰 주세요");
//		System.out.println();
//		System.out.println("정답 제출 >> ");
		
			
			// 응답
		 
		System.out.println();
		
		if (commit.equals("quit")) {
			// 게임 종료
			System.out.println("게임을 종료합니다.");
			
			// 스테이터스 조회
			System.out.println(idrp.getUser_id()+"\t"+idrp.getUser_rank()+"\t"+idrp.getUser_point()); 
			break;
		} else if (commit.equals("2")) {
			System.out.println("아이템 사용");
			
		}else if (commit.equals("3")) {
			// 스토어 뷰
			storeView.StoreView();
			// 상점이용
			CStore.usingStore();

			System.out.println();
			
			///////////////////////////////////////////////// 문제 풀기전에 아이템 사용할지 안할지 선택으로 수정
			
			
			
			// DB Answer 와 correct 대체 .//////////////////////////////////////////////////
			
		} else if (commit.equals(correct)) {
			// 정답 처리
			
			
			// 포인트 부여
		
			
			// 스테이터스
			
			// 문제 번호
			
			System.out.println();
			System.out
					.println("--------------------------------------------------------------------------");
		} else if (commit != correct) {
			// 오답 처리
			
			// 포인트 차감
			

			// 스테이터스
			
			

			System.out.println();
			System.out
					.println("--------------------------------------------------------------------------");
		}
		//스테이터스는 끝낫을떄 출력
		
	}
	
	public void Correct() {
	System.out.println("정답입니다!");
	System.out.println();
			
	}
	
	// 오답처리 
	public void Wrong() {
		System.out.println("땡.");
		System.out.println();
					
		}
}
