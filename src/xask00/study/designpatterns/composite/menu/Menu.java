package xask00.study.designpatterns.composite.menu;

public class Menu extends MenuComponent {
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	public void add(MenuComponent menuComp) {
		this.menuComponents.add(menuComp);
	}
	
	public MenuComponent remove(MenuComponent menuComp) {
		return this.menuComponents.remove(menuComp) ? menuComp : null;
	}
	
	public MenuComponent remove(int i) {
		return this.menuComponents.remove(i);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.print());
		for (MenuComponent mc: this.menuComponents) {
			sb.append(mc);
		}
		return sb.toString();
	}

}
