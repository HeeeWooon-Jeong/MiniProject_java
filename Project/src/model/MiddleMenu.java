package model;

import controller.CStore;
import view.Quit;
import view.Store;

public class MiddleMenu {
	Quit quit = new Quit();
	Store store = new Store();
	CStore cstore = new CStore();
	
	
	public void middle(int num) {
		System.out.println("[1] 다음 문제  [2] 상점이용  [3] 게임종료");
			
		if(num == 1) {
			
		}else if (num == 2) {
			store.StoreView();
			
			CStore.usingStore();
		}else if(num == 3) {
			quit.QuitGame();
			
		}
		
	}
	
}
