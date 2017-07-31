package xask00.study.designpatterns.composite.menu;

public class MenuItem extends MenuComponent {
	
	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return this.print();
	}

}
