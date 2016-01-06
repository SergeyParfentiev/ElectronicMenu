package Adapter.task3.v2;

import Adapter.task3.v2.calc.Adapter;
import Adapter.task3.v2.calc.Calculator;

import java.util.Random;

public class Launcher {

	public static void main(String[] args) {
		Calculator calc = new Adapter();
		
		Operations o = new Operations();
		o.setCalc(calc);

		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(o.createSummaryReport(r.nextInt(100)));
		}
	}
}
