package AdapterPattern.object_example.test;

import AdapterPattern.object_example.adapter.DuckAdapter;
import AdapterPattern.object_example.impl.MallardDuck;

public class TurkeyTest {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		DuckAdapter duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}