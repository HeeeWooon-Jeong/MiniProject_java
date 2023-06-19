package view;

public class Store {
	
	public void StoreView() {
	
		System.out.println("====상점====");
		
		String str = 
		" #####    ######   #####   ######   #######\n"  
		+"##   ##     ##    ##   ##  ##   ##  ##\n"       
		+"##          ##    ##   ##  ##   ##  ##\n"       
		+" #####      ##    ##   ##  ##   ##  #####\n"    
		+"     ##     ##    ##   ##  ######   ##\n"       
		+"##   ##     ##    ##   ##  ##  ##   ##\n"      
		+" #####      ##     #####   ##   ##  #######\n";  
		                                             
		System.out.println(str);
		
		System.out.println("--------------------------------------------------------------------------");		
	
		System.out.println("[1] 아이템1 : 1000");
		System.out.println("[2] 아이템2 : 1000");
		System.out.println("[3] 아이템3 : 1000");
		System.out.println("[0] 상점 나가기");
	}
}
