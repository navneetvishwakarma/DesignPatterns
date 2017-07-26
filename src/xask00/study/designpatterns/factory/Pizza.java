/**
 * 
 */
package xask00.study.designpatterns.factory;

import java.util.ArrayList;

/**
 * @author visna03
 *
 */
public abstract class Pizza {
	
	private String name;
	private String dough;
	private String souce;
	private ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name + "...");
		System.out.println("Making " + dough + " dough...");
		System.out.println("Spreading " + souce + " souce...");
		System.out.println("Adding toppings...");
		for(String topping: toppings) {
			System.out.println(topping);
		}
	}
	
	public void bake() {
		System.out.println("Baking " + name + "...");
	}
	
	public void cut() {
		System.out.println("Cutting " + name + " into slices...");
	}
	
	public void box() {
		System.out.println("Packing " + name + " into pizza box...");
	}
	
	public String getName() {
		return name;
	}
}
