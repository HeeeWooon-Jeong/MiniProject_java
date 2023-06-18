package controller;

import java.util.Scanner;

import model.User;
import view.Idrp;
import view.Main_display;
import view.Store;

public class Project_main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		Main_display mainDisplay = new Main_display();
		User user = new User();
		Idrp idrp = new Idrp();
		CStore store = new CStore();
		Store storeView = new Store();
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
			mainDisplay.render(); // 메인 로그인/회원가입 출력

			select = sc.nextInt();
			// 로그인
			if (select == 1) {
				System.out.println("========로그인========");

				System.out.print(" 아이디\t ==\t");
				loginId = sc.next();
				System.out.print(" 패스워드\t ==\t");
				loginPw = sc.next();

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

				User(joinId, joinPw);
				System.out.println("회원가입이 완료되었습니다.");
			} else {
				System.out.println("다시 선택 해주세요");
			}
			System.out.println();
			// 로그인 후 메뉴

			System.out.println("[1]게임시작 [2]전체랭킹조회 [3]상점이용 [4]종료");

			select = sc.nextInt();
			System.out.println("--------------------------------------------------------------------------");
	
			
			String answer = "";
			String correct = "영화";
			
			if (select == 1) {
				// 게임시작

				while (true) {
					// mp3 재생
//					mp3.play(path);
					
					System.out.println(n + "번 문제입니다...");
					System.out.println("\t이 영화의 제목을 맞춰 주세요");
					System.out.println();
					System.out.println("정답 제출 >> ");

					
					// 응답
					answer = sc.next();
					System.out.println();
					
					if (answer.equals("quit")) {
						// 게임 종료
						System.out.println("게임을 종료합니다.");
						idrp.Status(loginId, 0, 0);
						break;
					} else if (answer.equals("2")) {
						System.out.println("힌트");
						
					}else if (answer.equals("3")) {
						// 스토어 뷰
						storeView.StoreView();
						// 상점이용
						CStore.usingStore();

						System.out.println();
					} else if (answer.equals(correct)) {
						// 정답 처리
						System.out.println("정답입니다!");
						System.out.println();
						// 포인트 부여
						point += 0;

						// 스테이터스
						idrp.Status(loginId, 0, 0);
						// 문제 번호
						n++;
						System.out.println();
						System.out
								.println("--------------------------------------------------------------------------");
					} else if (answer != correct) {
						// 오답 처리
						System.out.println("땡.");
						System.out.println();

						// 포인트 차감
						point -= 0;

						// 스테이터스
						idrp.Status(loginId, 0, 0);
						n++;

						System.out.println();
						System.out
								.println("--------------------------------------------------------------------------");
					}
					System.out.print("[1] 다음문제로 넘어가기 [2] 힌트 [3] 상점이용");
					System.out.println("    [quit 입력으로 게임 종료]");
					System.out.println();
					System.out.println();
					System.out.println();
//					answer=sc.next();
//					if (answer.equals("1")) {
//						
//					}else if (answer.equals("2")) {
//						System.out.println("힌트");
//					}else if (answer.equals("3")) {
//						// 스토어 뷰
//						storeView.StoreView();
//						// 상점이용
//						CStore.usingStore();
//					}else if(answer.equals("quit")) {
//						
//						System.out.println("게임을 종료합니다.");
//						idrp.Status(loginId, 0, 0);
//						break;
//					}
					
				}
			} else if (select == 2) {
				// 전체랭킹조회

			} else if (select == 3) {

				// 상점이용

				storeView.StoreView();

				CStore.usingStore();

			} else if (select == 4) {

				// 종료

				System.out.println("게임을 종료합니다.");
				idrp.Status(loginId, n, select);
				break;

			}

		} // while문 종료

	}

	private static void User(String joinId, String joinPw) {
		// TODO 자동 생성된 메소드 스텁

	}

}
