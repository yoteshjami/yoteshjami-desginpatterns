package AdapterPattern.object_example.adapter;

import AdapterPattern.object_example.impl.MallardDuck;
import AdapterPattern.object_example.interfaces.DuckIF;
import AdapterPattern.object_example.interfaces.TurkeyIF;

public class DuckAdapter implements TurkeyIF {
	private final DuckIF duck;

	public DuckAdapter(final MallardDuck duck) {
		this.duck = duck;
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}

}
