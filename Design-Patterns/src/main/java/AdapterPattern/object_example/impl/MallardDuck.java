package AdapterPattern.object_example.impl;

import AdapterPattern.object_example.interfaces.DuckIF;

public class MallardDuck implements DuckIF {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}

}
