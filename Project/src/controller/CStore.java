package controller;

import java.util.Scanner;

import model.User;

public class CStore {
	
	public static void usingStore() {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		while (true) {
			
		
			int itemNumber = sc.nextInt();
			int itemPrice = 1000; // 아이템 가격
			
			if (itemNumber == 0) {
			    System.out.println("상점에서 나갑니다.");
			    break; // 반복문 종료
			}
			
			switch (itemNumber) {
			case 1:
				if (user.getUser_point() >= itemPrice) {
					user.setUser_point(user.getUser_point() - itemPrice);
					System.out.println("아이템1 구매가 완료되었습니다.");
					System.out.println("남은 포인트: " + user.getUser_point());
				} else {
					System.out.println("포인트가 부족하여 아이템1을 구매할 수 없습니다.");
				}
				break;
			case 2:
				if (user.getUser_point() >= itemPrice) {
					user.setUser_point(user.getUser_point() - itemPrice);
					System.out.println("아이템2 구매가 완료되었습니다.");
					System.out.println("남은 포인트: " + user.getUser_point());
				} else {
					System.out.println("포인트가 부족하여 아이템2을 구매할 수 없습니다.");
				}
				break;
			case 3:
				if (user.getUser_point() >= itemPrice) {
					user.setUser_point(user.getUser_point() - itemPrice);
					System.out.println("아이템3 구매가 완료되었습니다.");
					System.out.println("남은 포인트: " + user.getUser_point());
				} else {
					System.out.println("포인트가 부족하여 아이템3을 구매할 수 없습니다.");
				}
				break;
			
			default:
				System.out.println("잘못된 선택입니다.");
				
				
			}
		}

		
	}
	
}
