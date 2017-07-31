package xask00.study.designpatterns.composite.menu;

public class MenuDemo {

	public static void main(String[] args) {
		Menu menu = new Menu("Navigation", "/home");
		MenuItem miAccount = new MenuItem("My Profile", "/profile");
		menu.add(miAccount);
		Menu mActions = new Menu("Actions", "/actions");
		MenuItem miCut = new MenuItem("Cut", "/cut");
		mActions.add(miCut);
		MenuItem miCopy = new MenuItem("Copy", "/copy");
		mActions.add(miCopy);
		menu.add(mActions);
		
		System.out.println(menu);
	}

}
