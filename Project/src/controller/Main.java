package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.MiddleMenu;
import model.QuestionDAO;
import model.QuestionDTO;
import view.Idrp;
import view.Main_display;
import view.Quit;
import view.Store;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in); // 스캐너
		Random ran = new Random(); // 랜덤 함수
		Main_display mainDisplay = new Main_display(); // A Famous Line아스키 메인
		Store storeView = new Store(); // 상점 아스키코드
		Idrp idrp = new Idrp(); // 아이디 랭킹 포인트 스테이터스
		CStore store = new CStore(); // 상점 구매
		MP3Player mp3 = new MP3Player(); // mp3 재생
		QuestionDAO quesDAO = new QuestionDAO();  // DB 쿼리문
		QuestionDTO dto = new QuestionDTO(); // 명대사 mp3 테이블
		MiddleMenu middlemenu = new MiddleMenu();  // 중간 메뉴
		Quit quitGame = new Quit(); // 게임 종료 메서드
		
		
		
		
		
		// 로그인 변수
		String loginId = "";
		String loginPw = "";

		// 회원가입 변수
		String joinId = "";
		String joinPw = "";

		// 조회창 변수
		int point = 0;
		int rank = 0;

		// 선택란 변수
		int select = 0;

		// n번째 게임
		int n = 1;

		// 도입
		while (true) {
			System.out.println();
			mainDisplay.render(); // 메인 로그인/회원가입 출력

			select = sc.nextInt();
			// 로그인
			if (select == 1) {
				System.out.println("========로그인========");

				System.out.print(" 아이디\t ==\t");
				loginId = sc.next();
				System.out.print(" 패스워드\t ==\t");
				loginPw = sc.next();

				quesDAO.selectQuestion("영화");
				System.out.println();
				// 로그인 시도
				// db쪽 같아서 손 못댓습니다..
//			if(logId == userId && log Pw == userPw) {
//				
//			}

				// 회원가입
			} else if (select == 2) {
				System.out.println("========회원가입========");
				System.out.print(" 아이디\t ==\t");
				joinId = sc.next();
				System.out.print(" 패스워드\t ==\t");
				joinPw = sc.next();

				System.out.println("회원가입이 완료되었습니다.");
			} else {
				System.out.println("다시 선택 해주세요");
			}

			System.out.println();

			// 로그인 후 메뉴
			while(true) {
			System.out.println("--------------------------------------------------------------------------");
			
			
			System.out.println("[1]게임시작 [2]전체랭킹조회 [3]상점이용 [4]종료");
			select = sc.nextInt();

			System.out.println();

			
			System.out.println("--------------------------------------------------------------------------");
			
			if (select == 1) {
				// 게임시작

				// 장르선택
				System.out.println("장르 선택");
				System.out.println();
				System.out.println("[1]영화 [2]드라마 [3]게임 [4]광고 [5]전체 랜덤");

				select= sc.nextInt();
				if (select == 1) {
					 while(true) {  // 문제 소진시 종료 
						 quesDAO.selectAll("영화");
					System.out.println("영화 문제 입니다.");
					System.out.println();
					
					// 영화 문제

					// 영화 배열 문제 재생

					// 답 제출

					// 정답 오답 판단

					// 포인트 부여 차감
					System.out.println();
					
					middlemenu.middle(n);
					select = sc.nextInt();
					
					if(select== 3) {
						System.out.println("정말로 종료 하시겠습니까?");
//						
					select = sc.nextInt();
					if(select == 3) {
						break ;
					}
					}
				}	// while문 영화문제 끝
				
				} else if (select == 2) {
					// 드라마문제
					System.out.println("드라마 문제 입니다.");
					System.out.println();

				} else if (select == 3) {
					// 게임 문제
					System.out.println("게임 문제 입니다.");
					System.out.println();

				} else if (select == 4) {
					// 광고 문제
					System.out.println("광고 문제 입니다.");
					System.out.println();

				} else if (select == 5) {
					// 전체 랜덤문제
					System.out.println("주제 랜덤 문제 입니다.");
					System.out.println();

				} else {

				}

			}else if (select == 2) {
				// 전체랭킹조회

			} else if (select == 3) {

				// 상점이용

				storeView.StoreView();

				CStore.usingStore();

			} else if (select == 4) {

				// 종료

				quitGame.QuitGame();
				break;

			}
			}// 게임메뉴부터 while 문 종료
		} // 로그인부터 while문 종료

	}
}
